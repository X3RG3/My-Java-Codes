import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 * Single-file Pac-Man-like game in Java Swing.
 *
 * Features:
 * - Basic Pac-Man movement and pellet eating
 * - Multiple enemies (ghosts) with optional custom images
 * - Simple random ghost AI
 * - Place custom enemy images via command-line args or a file chooser at startup
 *
 * How to run:
 * 1) Compile: javac PacmanGame.java
 * 2) Run with image paths (optional):
 *      java PacmanGame path/to/ghost1.png path/to/ghost2.png
 *    or just run without args and a file chooser will let you pick images.
 *
 * Controls: Arrow keys to move Pac-Man.
 *
 * Drop custom PNG/JPEG images for ghosts. If an image fails to load, a colored circle will be used instead.
 */
public class PacmanGame {
    public static void main(String[] args) {
        // Collect image paths from args or via a file chooser
        java.util.List<String> imagePaths = new ArrayList<>();
        if (args != null && args.length > 0) {
            for (String a : args) imagePaths.add(a);
        }

        SwingUtilities.invokeLater(() -> {
            if (imagePaths.isEmpty()) {
                // Ask user to pick custom images (optional)
                int res = JOptionPane.showConfirmDialog(null,
                        "Do you want to choose custom enemy images?\n(You can skip and use defaults)",
                        "Custom enemy images", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.setMultiSelectionEnabled(true);
                    chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
                    int c = chooser.showOpenDialog(null);
                    if (c == JFileChooser.APPROVE_OPTION) {
                        for (File f : chooser.getSelectedFiles()) imagePaths.add(f.getAbsolutePath());
                    }
                }
            }

            JFrame frame = new JFrame("Pac-Man (simple)");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Board board = new Board(imagePaths);
            frame.setContentPane(board);
            frame.pack();
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            board.startGame();
        });
    }
}

class Board extends JPanel implements ActionListener, KeyListener {
    private static final int TILE = 24;
    private static final int ROWS = 21;
    private static final int COLS = 19;
    private static final int WIDTH = COLS * TILE;
    private static final int HEIGHT = ROWS * TILE;

    private Timer timer;
    private final int delay = 40; // ms

    // Map: 0=pellet, 1=wall, 2=empty
    private int[][] map = new int[ROWS][COLS];

    private int pacmanRow = 10, pacmanCol = 9; // start near center
    private int pacmanDir = 0; // 0=none,1=up,2=right,3=down,4=left
    private int desiredDir = 0;

    private ArrayList<Ghost> ghosts = new ArrayList<>();
    private java.util.List<String> imagePaths;

    private int score = 0;
    private int pelletsLeft = 0;

    public Board(java.util.List<String> imagePaths) {
        this.imagePaths = imagePaths;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        setFocusable(true);
        addKeyListener(this);
        initMap();
        loadGhosts();
        timer = new Timer(delay, this);
    }

    private void initMap() {
        // Simple map: walls around, some inner walls, pellets everywhere else
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (r == 0 || r == ROWS - 1 || c == 0 || c == COLS - 1) map[r][c] = 1;
                else map[r][c] = 0;
            }
        }
        // Add some blocks
        for (int r = 3; r <= 17; r += 4) {
            for (int c = 3; c <= 15; c += 6) {
                for (int rr = 0; rr < 2; rr++) for (int cc = 0; cc < 3; cc++) map[r + rr][c + cc] = 1;
            }
        }
        // Clear Pac-Man starting area
        map[pacmanRow][pacmanCol] = 2;
        // Count pellets
        pelletsLeft = 0;
        for (int r = 0; r < ROWS; r++) for (int c = 0; c < COLS; c++) if (map[r][c] == 0) pelletsLeft++;
    }

    private void loadGhosts() {
        // Create 4 ghosts by default, assign images if provided
        int[][] starts = {{1,1},{1,COLS-2},{ROWS-2,1},{ROWS-2,COLS-2}};
        for (int i = 0; i < 4; i++) {
            BufferedImage img = null;
            if (i < imagePaths.size()) {
                try {
                    img = ImageIO.read(new File(imagePaths.get(i)));
                } catch (IOException e) {
                    System.err.println("Failed to load image: " + imagePaths.get(i) + " -> " + e.getMessage());
                    img = null;
                }
            }
            Ghost g = new Ghost(starts[i][0], starts[i][1], img, i);
            ghosts.add(g);
        }
    }

    public void startGame() {
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updatePacman();
        updateGhosts();
        checkCollisions();
        repaint();
    }

    private void updatePacman() {
        // Try to change direction to desiredDir if possible
        if (desiredDir != 0 && canMove(pacmanRow, pacmanCol, desiredDir)) {
            pacmanDir = desiredDir;
        }
        if (pacmanDir != 0 && canMove(pacmanRow, pacmanCol, pacmanDir)) {
            switch (pacmanDir) {
                case 1 -> pacmanRow--;
                case 2 -> pacmanCol++;
                case 3 -> pacmanRow++;
                case 4 -> pacmanCol--;
            }
            // Eat pellet
            if (map[pacmanRow][pacmanCol] == 0) {
                map[pacmanRow][pacmanCol] = 2;
                score += 10;
                pelletsLeft--;
            }
        } else {
            // can't move; stop
            pacmanDir = 0;
        }
    }

    private boolean canMove(int r, int c, int dir) {
        int nr = r, nc = c;
        switch (dir) {
            case 1 -> nr--;
            case 2 -> nc++;
            case 3 -> nr++;
            case 4 -> nc--;
        }
        if (nr < 0 || nr >= ROWS || nc < 0 || nc >= COLS) return false;
        return map[nr][nc] != 1;
    }

    private void updateGhosts() {
        for (Ghost g : ghosts) g.move(this);
    }

    private void checkCollisions() {
        for (Ghost g : ghosts) {
            if (g.row == pacmanRow && g.col == pacmanCol) {
                // collision - simple: reset pacman and ghost positions
                score = Math.max(0, score - 100);
                pacmanRow = 10; pacmanCol = 9; pacmanDir = 0; desiredDir = 0;
                g.resetPosition();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        // draw map
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int x = c * TILE;
                int y = r * TILE;
                if (map[r][c] == 1) {
                    g.setColor(new Color(0, 0, 128));
                    g.fillRect(x, y, TILE, TILE);
                } else {
                    // pellet
                    if (map[r][c] == 0) {
                        g.setColor(Color.white);
                        int d = Math.max(2, TILE / 6);
                        g.fillOval(x + TILE/2 - d/2, y + TILE/2 - d/2, d, d);
                    }
                }
            }
        }

        // draw pacman
        int px = pacmanCol * TILE;
        int py = pacmanRow * TILE;
        g.setColor(Color.yellow);
        g.fillOval(px + 2, py + 2, TILE - 4, TILE - 4);
        // eye
        g.setColor(Color.black);
        g.fillOval(px + TILE/2 + 2, py + 6, 4, 4);

        // draw ghosts
        for (Ghost ghost : ghosts) ghost.render(g, TILE);

        // HUD
        g.setColor(Color.white);
        g.drawString("Score: " + score, 8, HEIGHT - 6);
        g.drawString("Pellets: " + pelletsLeft, WIDTH - 100, HEIGHT - 6);

        if (pelletsLeft == 0) {
            g.setFont(g.getFont().deriveFont(24f));
            g.setColor(Color.green);
            g.drawString("You win!", WIDTH/2 - 50, HEIGHT/2);
            timer.stop();
        }
    }

    // Key handling
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> desiredDir = 1;
            case KeyEvent.VK_RIGHT -> desiredDir = 2;
            case KeyEvent.VK_DOWN -> desiredDir = 3;
            case KeyEvent.VK_LEFT -> desiredDir = 4;
            case KeyEvent.VK_P -> { if (timer.isRunning()) timer.stop(); else timer.start(); }
        }
    }
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    // Helper to expose map to ghosts
    public boolean isOpen(int r, int c) {
        if (r < 0 || r >= ROWS || c < 0 || c >= COLS) return false;
        return map[r][c] != 1;
    }
}

class Ghost {
    int row, col;
    int startRow, startCol;
    BufferedImage image; // custom image (may be null)
    int id;
    int dir = 0; // 1=up,2=right,3=down,4=left
    Random rnd = new Random();

    public Ghost(int r, int c, BufferedImage img, int id) {
        this.row = r; this.col = c; this.startRow = r; this.startCol = c; this.image = img; this.id = id;
        dir = rnd.nextInt(4) + 1;
    }

    public void resetPosition() {
        row = startRow; col = startCol; dir = rnd.nextInt(4) + 1;
    }

    public void move(Board board) {
        // very simple movement: if can go forward, go most of the time; sometimes change direction at intersections
        if (!canMove(board, dir) || rnd.nextDouble() < 0.2) {
            // choose a new random valid direction, prefer not going back unless blocked
            int[] options = new int[4]; int count = 0;
            for (int d = 1; d <= 4; d++) if (canMove(board, d)) options[count++] = d;
            if (count > 0) {
                // avoid immediate backtracking
                int back = opposite(dir);
                int pick = options[rnd.nextInt(count)];
                if (count > 1 && pick == back) {
                    // try to pick a non-back
                    for (int i = 0; i < 5; i++) {
                        int p = options[rnd.nextInt(count)];
                        if (p != back) { pick = p; break; }
                    }
                }
                dir = pick;
            }
        }
        // move one tile if possible
        if (canMove(board, dir)) {
            switch (dir) {
                case 1 -> row--;
                case 2 -> col++;
                case 3 -> row++;
                case 4 -> col--;
            }
        }
    }

    private int opposite(int d) {
        return switch (d) {
            case 1 -> 3;
            case 2 -> 4;
            case 3 -> 1;
            case 4 -> 2;
            default -> 0;
        };
    }

    private boolean canMove(Board board, int d) {
        int nr = row, nc = col;
        switch (d) {
            case 1 -> nr--;
            case 2 -> nc++;
            case 3 -> nr++;
            case 4 -> nc--;
        }
        return board.isOpen(nr, nc);
    }

    public void render(Graphics2D g, int tile) {
        int x = col * tile;
        int y = row * tile;
        if (image != null) {
            // draw image scaled to tile
            g.drawImage(image, x + 1, y + 1, tile - 2, tile - 2, null);
        } else {
            // fallback colored ghost
            Color[] colors = {Color.red, Color.pink, Color.cyan, Color.orange};
            g.setColor(colors[id % colors.length]);
            g.fillOval(x + 2, y + 2, tile - 4, tile - 4);
            g.setColor(Color.white);
            g.fillOval(x + tile/4, y + tile/4, tile/6, tile/6);
            g.fillOval(x + tile*2/3 - tile/12, y + tile/4, tile/6, tile/6);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;

public class SnakeGame extends JPanel implements ActionListener {

    private static final int TILE_SIZE = 20;
    private static final int GRID_COLS = 30;
    private static final int GRID_ROWS = 25;
    private static final int PANEL_WIDTH = GRID_COLS * TILE_SIZE;
    private static final int PANEL_HEIGHT = GRID_ROWS * TILE_SIZE;

    private static final int INITIAL_DELAY_MS = 120;

    private LinkedList<Point> snake;
    private Direction direction;
    private boolean growing;

    private Point food;
    private final Random rand = new Random();

    private Timer timer;
    private boolean running;
    private boolean paused;
    private int score;
    private int delay;

    private BufferedImage headImage;   // custom head
    private double headRotation = 0;

    private Clip gameOverClip;         // game over sound
    private Clip eatClip;              // eating sound ✔ NEW

    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public SnakeGame() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);

        loadHeadImage();
        loadGameOverSound();
        loadEatSound();   // ✔ NEW
        initGame();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int k = e.getKeyCode();
                if (!running && k == KeyEvent.VK_R) {
                    initGame();
                    return;
                }
                if (k == KeyEvent.VK_P) {
                    togglePause();
                    return;
                }
                if (paused || !running) return;

                switch (k) {
                    case KeyEvent.VK_UP:
                    case KeyEvent.VK_W: changeDirection(Direction.UP); break;
                    case KeyEvent.VK_DOWN:
                    case KeyEvent.VK_S: changeDirection(Direction.DOWN); break;
                    case KeyEvent.VK_LEFT:
                    case KeyEvent.VK_A: changeDirection(Direction.LEFT); break;
                    case KeyEvent.VK_RIGHT:
                    case KeyEvent.VK_D: changeDirection(Direction.RIGHT); break;
                }
            }
        });
    }

    private void loadHeadImage() {
        try {
            headImage = ImageIO.read(new File("snake_head.png"));
        } catch (Exception e) {
            System.out.println("Head image not found. Using default.");
            headImage = null;
        }
    }

    private void loadGameOverSound() {
        try {
            File file = new File("gameover.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            gameOverClip = AudioSystem.getClip();
            gameOverClip.open(audioStream);
        } catch (Exception e) {
            System.out.println("Could not load gameover.wav");
            gameOverClip = null;
        }
    }

    // ✔ NEW – Load eating sound
    private void loadEatSound() {
        try {
            File file = new File("eat.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            eatClip = AudioSystem.getClip();
            eatClip.open(audioStream);
        } catch (Exception e) {
            System.out.println("Could not load eat.wav");
            eatClip = null;
        }
    }

    private void playGameOverSound() {
        if (gameOverClip != null) {
            gameOverClip.stop();
            gameOverClip.setFramePosition(0);
            gameOverClip.start();
        }
    }

    // ✔ NEW – Play eating sound
    private void playEatSound() {
        if (eatClip != null) {
            eatClip.stop();
            eatClip.setFramePosition(0);
            eatClip.start();
        }
    }

    private void initGame() {
        snake = new LinkedList<>();
        int startX = GRID_COLS / 2;
        int startY = GRID_ROWS / 2;

        snake.add(new Point(startX, startY));
        snake.add(new Point(startX - 1, startY));
        snake.add(new Point(startX - 2, startY));

        direction = Direction.RIGHT;
        headRotation = 0;

        growing = false;
        score = 0;
        delay = INITIAL_DELAY_MS;
        running = true;
        paused = false;

        placeFood();

        if (timer != null) timer.stop();
        timer = new Timer(delay, this);
        timer.start();
        repaint();
    }

    private void togglePause() {
        if (!running) return;
        paused = !paused;
        if (paused) timer.stop();
        else timer.start();
        repaint();
    }

    private void changeDirection(Direction newDir) {
        if (direction == Direction.UP && newDir == Direction.DOWN) return;
        if (direction == Direction.DOWN && newDir == Direction.UP) return;
        if (direction == Direction.LEFT && newDir == Direction.RIGHT) return;
        if (direction == Direction.RIGHT && newDir == Direction.LEFT) return;

        direction = newDir;

        switch (direction) {
            case UP: headRotation = -90; break;
            case DOWN: headRotation = 90; break;
            case LEFT: headRotation = 180; break;
            case RIGHT: headRotation = 0; break;
        }
    }

    private void placeFood() {
        while (true) {
            int x = rand.nextInt(GRID_COLS);
            int y = rand.nextInt(GRID_ROWS);
            Point p = new Point(x, y);
            if (!snake.contains(p)) {
                food = p;
                return;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!running || paused) return;
        step();
    }

    private void step() {
        Point head = snake.getFirst();
        Point newHead = new Point(head.x, head.y);

        switch (direction) {
            case UP: newHead.y--; break;
            case DOWN: newHead.y++; break;
            case LEFT: newHead.x--; break;
            case RIGHT: newHead.x++; break;
        }

        if (newHead.x < 0 || newHead.x >= GRID_COLS ||
            newHead.y < 0 || newHead.y >= GRID_ROWS) {
            gameOver();
            return;
        }

        if (snake.contains(newHead)) {
            gameOver();
            return;
        }

        snake.addFirst(newHead);

        // ✔ NEW — Eating logic with sound
        if (newHead.equals(food)) {
            score += 10;
            growing = true;
            playEatSound();   // 🔊 play eating sound
            placeFood();

            if (score % 50 == 0 && delay > 40) {
                delay -= 8;
                timer.setDelay(delay);
            }
        }

        if (!growing) snake.removeLast();
        growing = false;

        repaint();
    }

    private void gameOver() {
        running = false;
        timer.stop();
        playGameOverSound(); // 🔊 play game over sound
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(30, 30, 30));
        for (int i = 0; i <= GRID_COLS; i++)
            g.drawLine(i * TILE_SIZE, 0, i * TILE_SIZE, PANEL_HEIGHT);
        for (int j = 0; j <= GRID_ROWS; j++)
            g.drawLine(0, j * TILE_SIZE, PANEL_WIDTH, j * TILE_SIZE);

        g.setColor(Color.RED);
        g.fillOval(food.x * TILE_SIZE + 3, food.y * TILE_SIZE + 3,
                TILE_SIZE - 6, TILE_SIZE - 6);

        int i = 0;
        for (Point p : snake) {
            if (i == 0) drawHead(g, p);
            else {
                int shade = Math.max(40, 200 - i * 6);
                g.setColor(new Color(0, shade, 0));
                g.fillRect(p.x * TILE_SIZE + 1, p.y * TILE_SIZE + 1,
                        TILE_SIZE - 2, TILE_SIZE - 2);
            }
            i++;
        }

        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 10, 20);
        g.drawString("P - Pause | R - Restart", 150, 20);

        if (paused || !running) {
            g.setColor(new Color(0, 0, 0, 180));
            g.fillRect(0, PANEL_HEIGHT/2 - 40, PANEL_WIDTH, 100);

            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 36));
            String msg = paused ? "PAUSED" : "GAME OVER";
            g.drawString(msg, PANEL_WIDTH/2 - 80, PANEL_HEIGHT/2);

            g.setFont(new Font("Arial", Font.PLAIN, 18));
            g.drawString("Press R to Restart", PANEL_WIDTH/2 - 80, PANEL_HEIGHT/2 + 30);
        }
    }

    private void drawHead(Graphics g, Point p) {
        if (headImage == null) {
            g.setColor(new Color(0, 160, 0));
            g.fillRect(p.x * TILE_SIZE + 1, p.y * TILE_SIZE + 1,
                    TILE_SIZE - 2, TILE_SIZE - 2);
            return;
        }

        Graphics2D g2 = (Graphics2D) g.create();

        int px = p.x * TILE_SIZE;
        int py = p.y * TILE_SIZE;

        g2.rotate(Math.toRadians(headRotation),
                px + TILE_SIZE / 2.0,
                py + TILE_SIZE / 2.0);

        g2.drawImage(headImage, px, py, TILE_SIZE, TILE_SIZE, this);
        g2.dispose();
    }

    private static void createAndShowGui() {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame gamePanel = new SnakeGame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        SwingUtilities.invokeLater(gamePanel::requestFocusInWindow);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SnakeGame::createAndShowGui);
    }
}

// File: ShaperGame.java
// Compile: javac ShaperGame.java
// Run:     java ShaperGame

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import java.util.List;

public class ShaperGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShaperFrame().setVisible(true));
    }
}

class ShaperFrame extends JFrame {
    public ShaperFrame() {
        setTitle("Shaper — click the matching shape!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        GamePanel panel = new GamePanel(720, 520);
        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
}

class GamePanel extends JPanel {
    private final int width, height;
    private final Random rng = new Random();
    private final List<GameShape> shapes = new ArrayList<>();
    private final String[] shapeNames = {"Circle","Square","Triangle","Star","Hexagon"};
    private String target;
    private int score = 0;
    private int roundTime = 8; // seconds per round
    private int timeLeft;
    private Timer countdownTimer;
    private Timer motionTimer;
    private boolean running = false;
    private final Font big = new Font("SansSerif", Font.BOLD, 28);
    private final Font small = new Font("SansSerif", Font.PLAIN, 14);

    public GamePanel(int w, int h) {
        width = w; height = h;
        setPreferredSize(new Dimension(w,h));
        setBackground(new Color(0xF4F7FA));
        setFocusable(true);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!running) {
                    startNewGame();
                    return;
                }
                Point p = e.getPoint();
                // check shapes in reverse order (top-most first)
                for (int i = shapes.size()-1; i >= 0; i--) {
                    GameShape gs = shapes.get(i);
                    if (gs.contains(p)) {
                        handleShapeClick(gs);
                        return;
                    }
                }
            }
        });

        // shape motion: move shapes a little every 40ms
        motionTimer = new Timer(40, ev -> {
            for (GameShape s : shapes) s.step(width, height);
            repaint();
        });

        // countdown timer (1s ticks)
        countdownTimer = new Timer(1000, ev -> {
            if (!running) return;
            timeLeft--;
            if (timeLeft <= 0) {
                endRound(false);
            }
            repaint();
        });

        // initial screen
        resetToTitle();
    }

    private void resetToTitle() {
        running = false;
        shapes.clear();
        target = "— Click to Start —";
        repaint();
    }

    private void startNewGame() {
        score = 0;
        roundTime = 8;
        startRound();
    }

    private void startRound() {
        running = true;
        timeLeft = roundTime;
        shapes.clear();

        // pick a target shape
        target = shapeNames[rng.nextInt(shapeNames.length)];

        // spawn shapes (one correct, others distractors)
        int total = 6;
        int correctIndex = rng.nextInt(total);
        for (int i = 0; i < total; i++) {
            String type = (i == correctIndex) ? target : randomDifferentShape(target);
            shapes.add(spawnShape(type));
        }

        // start timers
        if (!motionTimer.isRunning()) motionTimer.start();
        if (!countdownTimer.isRunning()) countdownTimer.start();

        repaint();
    }

    private String randomDifferentShape(String avoid) {
        String r;
        do { r = shapeNames[rng.nextInt(shapeNames.length)]; } while (r.equals(avoid));
        return r;
    }

    private GameShape spawnShape(String type) {
        int size = 48 + rng.nextInt(36); // 48..83
        int x = 30 + rng.nextInt(Math.max(10, width - 60 - size));
        int y = 110 + rng.nextInt(Math.max(10, height - 160 - size));
        double vx = (rng.nextDouble() - 0.5) * 3.0; // gentle motion
        double vy = (rng.nextDouble() - 0.5) * 3.0;
        Color c = randomNiceColor();
        return new GameShape(type, x, y, size, vx, vy, c);
    }

    private Color randomNiceColor() {
        float hue = rng.nextFloat();
        float sat = 0

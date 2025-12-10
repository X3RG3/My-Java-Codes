// File: LudoDiceGUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class LudoDiceGUI {
    private final JFrame frame;
    private final JLabel faceLabel;
    private final JButton rollButton;
    private final JLabel infoLabel;
    private final Random rng = new Random();

    public LudoDiceGUI() {
        frame = new JFrame("Ludo Dice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 260);
        frame.setLayout(new BorderLayout(10, 10));

        faceLabel = new JLabel("", SwingConstants.CENTER);
        faceLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 64));
        faceLabel.setPreferredSize(new Dimension(200,120));
        faceLabel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        updateFace(1);

        rollButton = new JButton("Roll");
        rollButton.setFont(rollButton.getFont().deriveFont(18f));
        rollButton.addActionListener(e -> animateRoll());

        infoLabel = new JLabel("Press Roll to throw the dice", SwingConstants.CENTER);

        JPanel center = new JPanel(new BorderLayout());
        center.add(faceLabel, BorderLayout.CENTER);

        JPanel bottom = new JPanel(new BorderLayout());
        bottom.add(rollButton, BorderLayout.CENTER);
        bottom.add(infoLabel, BorderLayout.SOUTH);

        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void updateFace(int v) {
        // Use Unicode dice characters for clear visuals: ⚀..⚅ (U+2680..U+2685)
        char diceChar = (char)(0x2680 + (v - 1));
        faceLabel.setText(String.valueOf(diceChar));
    }

    private void animateRoll() {
        rollButton.setEnabled(false);
        infoLabel.setText("Rolling...");
        // Simple animation: show random faces quickly then final value
        final int frames = 12;
        final int delayMs = 40; // 12*40 = ~480ms animation
        final Timer timer = new Timer(delayMs, null);
        final int[] count = {0};

        timer.addActionListener(new ActionListener() {
            int finalValue = -1;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count[0] < frames - 1) {
                    int rnd = rng.nextInt(6) + 1;
                    updateFace(rnd);
                } else {
                    finalValue = rng.nextInt(6) + 1;
                    updateFace(finalValue);
                    infoLabel.setText("You rolled: " + finalValue + (finalValue == 6 ? " → Extra turn!" : ""));
                    timer.stop();
                    rollButton.setEnabled(true);
                }
                count[0]++;
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    public static void main(String[] args) {
        // Ensure nice look-and-feel
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}
        SwingUtilities.invokeLater(LudoDiceGUI::new);
    }
}

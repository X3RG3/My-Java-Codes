import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Clickable Text Demo");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel textButton = new JLabel("Forgot Password?");
        textButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textButton.setForeground(new Color(120, 200, 255)); // link color
        textButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Hover effect
        textButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                textButton.setForeground(new Color(180, 230, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textButton.setForeground(new Color(120, 200, 255));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Forgot password clicked!");
            }
        });

        frame.add(textButton, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

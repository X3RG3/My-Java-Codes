import javax.swing.*;
import java.awt.Color;
public class FirstGUI{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setTitle("Test Title of GUi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("GUIicon.png");
		frame.setIconImage(image.getImage());
		
		frame.getContentPane().setBackground(Color.green);
	}
}
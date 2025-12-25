import javax.swing.*;
public class FrameTest extends JFrame{
	JPanel panel;
	
	public FrameTest(){
		super("MyFirstGUI");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
	}
}
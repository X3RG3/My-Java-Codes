import java.lang.*;
import javax.swing.*;
public class FrameTest extends JFrame{
	JPanel panel;
	JLabel namelbl,passlbl;
	JTextField namefld;
	JPasswordField passfld;
	
	public FrameTest(){
		super("MyFirstGUI");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		namelbl = new JLabel("Name : ");
		namelbl.setBounds(50,90,300,50);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(150,90,350,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Password : ");
		passlbl.setBounds(50,150,100,50);
		panel.add(passlbl);
		
		passfld = new JPasswordField();
		passfld.setBounds(150,150,350,50);
		passfld.setEchoChar('#');
		panel.add(passfld);
		
		this.add(panel);
	}
}
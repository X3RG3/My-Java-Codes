import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame{
	JPanel panel;
	JLabel namelbl,passlbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton loginbtn,signupbtn,backbtn;
	Font font;
	
	public FrameTest(){
		super("MyFirstGUI");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c1 = new Color(226,175,255);
		
		panel = new JPanel();
		panel.setBackground(c1);
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
		passfld.setEchoChar('$');
		panel.add(passfld);
		
		loginbtn = new JButton("LogIn");
		loginbtn.setBounds(120,250,100,50);
		panel.add(loginbtn);
		
		signupbtn = new JButton("SignUp");
		signupbtn.setBounds(270,250,100,50);
		panel.add(signupbtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(420,250,100,50);
		panel.add(backbtn);
		
		this.add(panel);
	}
}
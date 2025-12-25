import java.lang.*;
import javax.swing.*;

public class FrameDemo extends JFrame
{
	
	JPanel panel;
	JLabel namelbl,passlbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,sgnbtn,backbtn;
	
	public FrameDemo()
	{
		super("MyFirstGUI");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		namelbl=new JLabel("Name");
		namelbl.setBounds(150,50,100,50);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(250,50,200,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Password");
		passlbl.setBounds(150,150,100,50);
		panel.add(passlbl);
		
		
		passfld=new JPasswordField();
		passfld.setBounds(250,150,200,50);
		passfld.setEchoChar('#');
		panel.add(passfld);
		
		lgnbtn=new JButton("LogIn");
		lgnbtn.setBounds(120,250,100,50);
		panel.add(lgnbtn);
		
		sgnbtn=new JButton("SignUp");
		sgnbtn.setBounds(250,250,100,50);
		panel.add(sgnbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(380,250,100,50);
		panel.add(backbtn);
		
		this.add(panel);
	}
	
}
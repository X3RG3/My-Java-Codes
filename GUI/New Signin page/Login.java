import java.lang.*;
import javax.swing.*;
import java.awt.*;


public class Login extends JFrame{
	private JPanel panel;
	private JLabel namelbl,passlbl,imglbl;
	private JTextField namefld;
	private JPasswordField passfld;
	private JButton lgnbtn,sgnbtn,backbtn;
	private ImageIcon  img;
	 
	public Login(){
		super("LogIn Page");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color c1 = new Color(222,226,255);
		Color c2 = new Color(129,114,254);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		namelbl = new JLabel("Name : ");
		namelbl.setBounds(400,50,100,50);
		//namelbl.setForeground(Color.WHITE);
		panel.add(namelbl);
		
		namefld= new JTextField();
		namefld.setBounds(400,100,300,50);
		panel.add(namefld);
		
		passlbl = new JLabel("Password : ");
		//passlbl.setForeground(Color.WHITE);
		passlbl.setBounds(400,150,100,50);
		panel.add(passlbl);
		
		passfld = new JPasswordField();
		passfld.setBounds(400,200,300,50);
		passfld.setEchoChar('#');
		panel.add(passfld);
		
		lgnbtn = new JButton("Login");
		lgnbtn.setBounds(400,270,90,55);
		lgnbtn.setForeground(Color.WHITE);
		lgnbtn.setBackground(c2);
		panel.add(lgnbtn);
		
		sgnbtn = new JButton("Signup");
		sgnbtn.setBounds(505,270,90,55);
		sgnbtn.setForeground(Color.WHITE);
		sgnbtn.setBackground(c2);
		panel.add(sgnbtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(605,270,90,55);
		backbtn.setForeground(Color.WHITE);
		backbtn.setBackground(c2);
		panel.add(backbtn);
		
		img = new ImageIcon("./LoginPage.png");
		imglbl=new JLabel(img);
		imglbl.setBounds(0,0,400,400);
		panel.add(imglbl);
		
		this.add(panel);
	}
}
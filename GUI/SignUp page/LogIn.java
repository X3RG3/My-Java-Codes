import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class LogIn extends JFrame{
	JPanel panel;
	JLabel login,namelbl,passlbl,loginlbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton loginbtn,signupbtn,backbtn;
	Font font;
	
	public LogIn(){
		super("MyFirstGUI");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c1 = new Color(159,160,255);
		Color c2 = new Color(187,173,255);
		panel = new JPanel();
		panel.setBackground(c1);
		panel.setLayout(null);
		
		login = new JLabel("LogIn");
		login.setBounds(300,20,100,50);
		login.setForeground(Color.WHITE);
		panel.add(login);
		
		namelbl = new JLabel("Name : ");
		namelbl.setBounds(50,90,100,50);
		namelbl.setForeground(Color.WHITE);
		namelbl.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(150,90,350,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Password : ");
		passlbl.setBounds(50,150,100,50);
		passlbl.setForeground(Color.WHITE);
		passlbl.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(passlbl);
		
		passfld = new JPasswordField();
		passfld.setBounds(150,150,350,50);
		passfld.setEchoChar('♡');
		panel.add(passfld);
		
		loginbtn = new JButton("LogIn");
		loginbtn.setBounds(120,250,100,50);
		loginbtn.setBackground(c2);
		loginbtn.setForeground(Color.WHITE);
		panel.add(loginbtn);
		
		signupbtn = new JButton("SignUp");
		signupbtn.setBounds(270,250,100,50);
		signupbtn.setBackground(c2);
		signupbtn.setForeground(Color.WHITE);
		panel.add(signupbtn);
		signupbtn.addActionListener(e -> {
            new SignUp(); 
            this.dispose(); 
        });
		
		backbtn = new JButton("Back");
		backbtn.setBounds(420,250,100,50);
		backbtn.setBackground(c2);
		backbtn.setForeground(Color.WHITE);
		panel.add(backbtn);
		backbtn.addActionListener(e->{
			new Welcome();
			this.dispose();
		});
		
		setVisible(true);
		this.add(panel);
	}
}
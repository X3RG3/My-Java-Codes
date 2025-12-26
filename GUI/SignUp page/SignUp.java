import javax.swing.*;
import java.awt.*;
public class SignUp extends JFrame{
	JPanel panel;
	JLabel signup,namelbl,mblbl,passlbl;
	JTextField namefld,mbfld;
	JPasswordField passfld;
	public SignUp(){
		super("Sign Up");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c1 = new Color(159,160,255);
		Color c2 = new Color(187,173,255);
		
		panel = new JPanel();
		panel.setBackground(c1);
		panel.setLayout(null);
		
		signup = new JLabel("SignUp");
		signup.setBounds(300,20,100,50);
		signup.setForeground(Color.WHITE);
		panel.add(signup);
		
		namelbl=new JLabel("Name : ");
		namelbl.setBounds(50,80,100,50);
		namelbl.setForeground(Color.WHITE);
		namelbl.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(150,80,400,50);
		namefld.setBackground(c2);
		panel.add(namefld);
		
		mblbl=new JLabel("Mobile : ");
		mblbl.setBounds(50,150,100,50);
		mblbl.setForeground(Color.WHITE);
		mblbl.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(mblbl);
		
		mbfld=new JTextField();
		mbfld.setBounds(150,150,400,50);
		mbfld.setBackground(c2);
		panel.add(mbfld);
		
		passlbl=new JLabel("Password : ");
		passlbl.setBounds(50,220,100,50);
		passlbl.setForeground(Color.WHITE);
		passlbl.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(150,220,400,50);
		passfld.setBackground(c2);
		passfld.setEchoChar('⁜');
		panel.add(passfld);
		
		
		
		this.add(panel);
	}
}
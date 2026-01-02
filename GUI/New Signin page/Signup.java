import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signup extends JFrame implements MouseListener,ActionListener{
	private JPanel panel;
	private JLabel namelbl,passlbl,imglbl;
	private JTextField namefld;
	private JPasswordField passfld;
	private JButton sgnbtn,backbtn;
	private ImageIcon  simg;
	private Font f1;
	Color c1 = new Color(222,226,255);
	Color c2 = new Color(129,114,254);
	Color c3 = new Color(165,174,255);
	 
	public Signup(){
		super("Signup Page");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1 = new Font("Cambria",Font.PLAIN,22);
		namelbl = new JLabel("Name : ");
		namelbl.setBounds(400,50,100,50);
		namelbl.setFont(f1);
		//namelbl.setForeground(Color.WHITE);
		panel.add(namelbl);
		
		namefld= new JTextField();
		namefld.setBounds(400,100,300,50);
		panel.add(namefld);
		
		passlbl = new JLabel("Password : ");
		passlbl.setFont(f1);
		//passlbl.setForeground(Color.WHITE);
		passlbl.setBounds(400,150,120,50);
		panel.add(passlbl);
		
		passfld = new JPasswordField();
		passfld.setBounds(400,200,300,50);
		passfld.setEchoChar('#');
		panel.add(passfld);
		

		sgnbtn = new JButton("Signup");
		sgnbtn.setBounds(400,270,145,50);
		sgnbtn.setForeground(Color.WHITE);
		sgnbtn.addMouseListener(this);
		sgnbtn.addActionListener(this);
		sgnbtn.setBackground(c2);
		panel.add(sgnbtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(555,270,145,50);
		backbtn.setForeground(Color.WHITE);
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		backbtn.setBackground(c2);
		panel.add(backbtn);
		
		simg = new ImageIcon(Signup.class.getResource("SignupPage.png"));
		imglbl=new JLabel(simg);
		imglbl.setBounds(0,0,400,400);
		panel.add(imglbl);
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me) {}

	public void mousePressed(MouseEvent me) {}

	public void mouseReleased(MouseEvent me) {}

	public void mouseEntered(MouseEvent me){
		if(me.getSource()==sgnbtn){
			sgnbtn.setBackground(c3);
			sgnbtn.setForeground(Color.BLACK);
		}
		
		else if(me.getSource()==backbtn){
			backbtn.setBackground(c3);
			backbtn.setForeground(Color.BLACK);
		}
	}
	
	public void mouseExited(MouseEvent me){
		if(me.getSource()==sgnbtn){
			sgnbtn.setBackground(c2);
			sgnbtn.setForeground(Color.WHITE);
		}
		
		else if(me.getSource()==backbtn){
			backbtn.setBackground(c2);
			backbtn.setForeground(Color.WHITE);
		}
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==backbtn){
			this.setVisible(false);
			Login l = new Login();
			l.setVisible(true);
		}
	}
}
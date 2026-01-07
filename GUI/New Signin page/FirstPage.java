import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FirstPage extends JFrame implements MouseListener,ActionListener{
	private JPanel panel;
	private JLabel userlbl,imglbl;
	private JTextField namefld;
	private JPasswordField passfld;
	private JButton sgnbtn,backbtn;
	private ImageIcon  simg;
	private Font f1;
	Color c1 = new Color(222,226,255);
	Color c2 = new Color(129,114,254);
	Color c3 = new Color(165,174,255);
	 
	public FirstPage(String s1,String s2,Login l){
		super("First Page");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1 = new Font("Cambria",Font.PLAIN,22);
		userlbl = new JLabel("User Name : "+s1);
		userlbl.setBounds(400,50,250,50);
		userlbl.setFont(f1);
		//userlbl.setForeground(Color.WHITE);
		panel.add(userlbl);
		
		/*simg = new ImageIcon(Signup.class.getResource("Background.gif"));
		imglbl=new JLabel(simg);
		imglbl.setBounds(0,0,800,450);
		panel.add(imglbl);*/
		
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
import javax.swing.*;
import java.awt.*;
public class Welcome extends JFrame{
	JPanel panel;
	ImageIcon icon;
	JButton lgbtn;
	JLabel pic;
	
	public Welcome(){
		super("Welcome To My GUI");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Color c1 = new Color(159,160,255);
		Color c2 = new Color(187,173,255);
		panel = new JPanel();
		panel.setBackground(c1);
		panel.setLayout(null);
		
		icon = new ImageIcon("wlcmpic.png");
		pic = new JLabel(icon);
		pic.setBounds(175,50,250,250);
		panel.add(pic);
		
		lgbtn =new JButton("Let's Go →");
		lgbtn.setBounds(250,300,100,50);
		lgbtn.setBackground(c2);
		lgbtn.setForeground(Color.WHITE);
		panel.add(lgbtn);
		lgbtn.addActionListener( e->{
			new LogIn();
			this.dispose();
		});
		
		setVisible(true);
		this.add(panel);
	}
}
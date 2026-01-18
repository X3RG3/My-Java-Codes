package Framesd;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class Homepage extends JFrame implements ActionListener
{
	JPanel hpanel;
	JLabel usrlbl;
	JButton hbackbtn;
	FrameDemo fd;
	
	
	public Homepage(String s1,String s2,FrameDemo fd)
	{
		super("Homepage");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.fd=fd;
		hpanel=new JPanel();
		hpanel.setLayout(null);
		
		usrlbl=new JLabel("User "+s1+" "+s2);
		usrlbl.setBounds(200,100,200,50);
		hpanel.add(usrlbl);
		
		hbackbtn=new JButton("Back");
		hbackbtn.setBounds(300,200,100,50);
		hbackbtn.addActionListener(this);
		hpanel.add(hbackbtn);
		
		
		this.add(hpanel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==hbackbtn)
		{
			this.setVisible(false);
			FrameDemo f1=new FrameDemo();
			f1.setVisible(true);
		}
	}
}
package Framesd;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class Register extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel rnamelbl,rpasslbl;
	JTextField rnamefld;
	JPasswordField rpassfld;
	JButton rsgnbtn,rbackbtn;
	
	public Register()
	{
		super("Registration");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		
		rnamelbl=new JLabel("Name");
		rnamelbl.setBounds(150,50,100,50);
		panel.add(rnamelbl);
		
		
		rnamefld=new JTextField();
		rnamefld.setBounds(250,50,150,50);
		panel.add(rnamefld);
		
		rpasslbl=new JLabel("Password");
		rpasslbl.setBounds(150,150,100,50);
		panel.add(rpasslbl);
		
		
		rpassfld=new JPasswordField();
		rpassfld.setBounds(250,150,150,50);
		rpassfld.setEchoChar('#');
		panel.add(rpassfld);
		
		rsgnbtn=new JButton("SignUp");
		rsgnbtn.setBounds(250,250,100,50);
		rsgnbtn.addActionListener(this);
		panel.add(rsgnbtn);
		
		rbackbtn=new JButton("Back");
		rbackbtn.setBounds(380,250,100,50);
		rbackbtn.addActionListener(this);
		panel.add(rbackbtn);
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1=rnamefld.getText();
		String s2=rpassfld.getText();
		
		if(ae.getSource()==rsgnbtn)
		{
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill up all");
			}
			else
			{
				Account acc=new Account(s1,s2);
				acc.addAccount();
				
				JOptionPane.showMessageDialog(null,"Now oK");
				this.setVisible(false);
				FrameDemo f1=new FrameDemo();
				f1.setVisible(true);
			}
		}
		else if(ae.getSource()==rbackbtn)
		{
			this.setVisible(false);
			FrameDemo f1=new FrameDemo();
			f1.setVisible(true);
		}
	}
}
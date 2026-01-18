package Framesd;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class FrameDemo extends JFrame implements MouseListener,ActionListener
{
	
	JPanel panel;
	JLabel namelbl,passlbl,imglbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,sgnbtn,backbtn;
	Color mycolor,mycolor1;
	Font myfont;
	ImageIcon img;
	
	public FrameDemo()
	{
		super("MyFirstGui");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		
		mycolor=new Color(14,230,220);
		mycolor1=new Color(188,222,227);
		myfont=new Font("Cambria",Font.PLAIN,22);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		//panel.setBackground(Color.RED);
		
		namelbl=new JLabel("Name");
		namelbl.setBounds(150,50,100,50);
		namelbl.setBackground(mycolor1);
		namelbl.setOpaque(true);
		namelbl.setFont(myfont);
		panel.add(namelbl);
		
		
		namefld=new JTextField();
		namefld.setBounds(250,50,150,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Password");
		passlbl.setBounds(150,150,100,50);
		panel.add(passlbl);
		
		
		passfld=new JPasswordField();
		passfld.setBounds(250,150,150,50);
		passfld.setEchoChar('#');
		panel.add(passfld);
		
		lgnbtn=new JButton("Login");
		lgnbtn.setBounds(120,250,100,50);
		lgnbtn.setBackground(mycolor1);
		lgnbtn.setForeground(Color.WHITE);
		lgnbtn.setFont(myfont);
		lgnbtn.addMouseListener(this);
		lgnbtn.addActionListener(this);
		panel.add(lgnbtn);
		
		sgnbtn=new JButton("SignUp");
		sgnbtn.setBounds(250,250,100,50);
		sgnbtn.setBackground(mycolor1);
		sgnbtn.setForeground(Color.WHITE);
		sgnbtn.setFont(myfont);
		sgnbtn.addMouseListener(this);
		sgnbtn.addActionListener(this);
		panel.add(sgnbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(380,250,100,50);
		backbtn.setBackground(mycolor1);
		backbtn.setForeground(Color.WHITE);
		backbtn.setFont(myfont);
		backbtn.addMouseListener(this);
		panel.add(backbtn);
		
		img=new ImageIcon("./Images/oop1N.jpg");
		imglbl=new JLabel(img);
		imglbl.setBounds(0,0,800,450);
		panel.add(imglbl);
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==lgnbtn)
		{
			lgnbtn.setBackground(Color.RED);
			lgnbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==sgnbtn)
		{
			sgnbtn.setBackground(Color.GREEN);
			sgnbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==backbtn)
		{
			backbtn.setBackground(Color.BLUE);
			backbtn.setForeground(Color.BLACK);
		}
		
		
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==lgnbtn)
		{
			lgnbtn.setBackground(mycolor1);
			lgnbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==sgnbtn)
		{
			sgnbtn.setBackground(mycolor1);
			sgnbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==backbtn)
		{
			backbtn.setBackground(mycolor1);
			backbtn.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1=namefld.getText();
		String s2=passfld.getText();
		
		if(ae.getSource()==sgnbtn)
		{
			this.setVisible(false);
			Register r1=new Register();
			r1.setVisible(true);
		}
		else if(ae.getSource()==lgnbtn)
		{
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Error");
			}
			else
			{
				Account a1=new Account();
				if(a1.getAccount(s1,s2)==true)
				{
					JOptionPane.showMessageDialog(null,"ok ok");
					this.setVisible(false);
					Homepage h1=new Homepage(s1,s2,this);
					h1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid");
				}
				
			}
			
		}
	}
	
	
}

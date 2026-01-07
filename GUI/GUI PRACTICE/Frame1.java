import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame{
	private JPanel panel;
	private JTextArea ta1;
	private JRadioButton r1,r2;
	private JCheckBox cb1,cb2;
	private ButtonGroup bg1;
	private JComboBox cmbx;
	public Frame1(){
		super("Frame 1");
		this.setSize(900,560);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		cb1 = new JCheckBox("RadioHead");
		cb1.setBounds(400,150,100,50);
		panel.add(cb1);
		
		/*String[] n = new String[]{"Ayon","Irfan"};
		cmbx = new JComboBox(n);
		cmbx.setBounds(50,50,100,50);
		panel.add(cmbx);*/
		
		JTextArea textArea = new JTextArea("Baler Jibon",5, 20);
		panel.add(textArea);

		
		r1 = new JRadioButton("Male");
		r1.setBounds(200,300,100,50);
		panel.add(r1);
		r2 = new JRadioButton("Female");
		r2.setBounds(200,420,100,50);
		panel.add(r2);
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		this.add(panel);
	}
}
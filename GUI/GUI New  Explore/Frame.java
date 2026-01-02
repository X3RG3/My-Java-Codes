import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame extends JFrame implements MouseListener{
	private JPanel panel;
	private JLabel textlbl,imglbl;
	private JRadioButton r1,r2,r3;
	private JButton btn1;
	private ImageIcon img1, img2 ; 
	
	public Frame(){
		super("Test Frame");
		this.setSize(900,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);

		img1 = new ImageIcon("./gif.gif");
		img2 = new ImageIcon("./gif2.gif");
		
		btn1 = new JButton(img1);
		btn1.setBounds(0,0,480,480);
		btn1.addMouseListener(this);
		panel.add(btn1);

		this.add(panel);
	}
	public void mouseClicked(MouseEvent me) {}

	public void mousePressed(MouseEvent me) {}

	public void mouseReleased(MouseEvent me) {}

	public void mouseEntered(MouseEvent me){
		if(me.getSource()==btn1){
			btn1.setIcon(img2);
		}
	}
	
	public void mouseExited(MouseEvent me){
		if(me.getSource()==btn1){
			btn1.setIcon(img1);
		}
	}
	
}
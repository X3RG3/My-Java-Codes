import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Page extends JFrame implements MouseListener{
    private JPanel panel;
    private JButton btn;
    public Page(){
        super("This is a test page...!!");
        this.setSize(600,350);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        btn = new JButton("Tap Here");
        btn.setBounds(200,200,100,50);
        btn.addMouseListener(this);
        panel.add(btn);

        this.add(panel);

    }
    public void mouseClicked(MouseEvent me) {}

	public void mousePressed(MouseEvent me) {}

	public void mouseReleased(MouseEvent me) {}

	public void mouseEntered(MouseEvent me) {
        if(me.getSource()==btn){
            btn.setBounds(200,90,100,50);
        }
    }
    public void mouseExited(MouseEvent me){
        if(me.getSource()==btn){
            btn.setBounds(200,200,100,50);
        }
    }
    
}

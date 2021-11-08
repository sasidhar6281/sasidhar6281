//my first GUI application 
//import swing package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstGui implements ActionListener
{
	JPanel p;
	public MyFirstGui()
	{
		//create it
		JFrame f = new JFrame("Sasi window");		
		p = new JPanel();
		JButton jb = new JButton("click me"); 
		
		//configure it
		p.setBounds(0,0,125,200);		
		p.setBackground(Color.yellow);
		jb.setBounds(120,140,100,30);
		p.setLayout(null);
		f.setVisible(true);
		f.setSize(300,300);
		//f.setTitle("First window");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add it
		f.add(p);
		p.add(jb);
		
		jb.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		MyFirstGui win = new MyFirstGui();
	}
	//Listen it
	public void actionPerformed(ActionEvent e)
	{
		int min = 0;
		int max = 255;
		int r =(int)(Math.random()*(max-min+1)+min);
		int b = (int)(Math.random()*(max-min+1)+min);
		int g = (int)(Math.random()*(max-min+1)+min);
		Color c = new Color(r,b,g);
		p.setBackground(c);
		
	}
	
}
	
 
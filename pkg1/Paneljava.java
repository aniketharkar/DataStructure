package pkg1;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;


public class Paneljava extends JFrame {
	
	
	
	
	Paneljava() {
		this.setTitle("panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel();
		label.setText("hello sir, this is jarvis");
		label.setIcon(new ImageIcon("C:\\Users\\91845\\javalearning\\src\\pkg1\\png-transparent.png"));
		label.setBounds(20,30,100,100);
		
		JPanel panel =new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(20,30,150,150);
		panel.add(label);
		panel.setLayout(null);
		
		this.add(panel);
		
		this.pack();
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Paneljava();

	}

}

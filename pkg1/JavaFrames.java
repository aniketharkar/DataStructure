package pkg1;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JavaFrames {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setResizable(false);
		
		frame.getContentPane().setBackground(new Color(0x123456));
		ImageIcon image = new ImageIcon("C:\\Users\\91845\\javalearning\\src\\pkg1\\i.png");
		frame.setIconImage(image.getImage());
		
		frame.setVisible(true);
		
		

	}

}

package pkg1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*
;
public class ChildFrame extends JFrame{
	
	
	
	
	
	
	
	
	ChildFrame(){
		ImageIcon image = new ImageIcon("C:\\Users\\91845\\javalearning\\src\\pkg1\\i.png");
		this.setTitle("hello ");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0x123456));
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
		
	}

}

//package pkg1;
//
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//
//
//public class Buttonjava extends JFrame{
//	
//	Buttonjava() {
//		
//		
//		this.setTitle("button");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		this.getContentPane().setBackground(Color.BLUE);
//		this.setSize(400,500);
//		
//		JLabel label = new JLabel();
//		label.setBounds(10,60,200,100);
//		label.setBackground(Color.ORANGE);
//		label.setText("hello this is jarvis");
//		
//		
//		 
//		JButton button = new JButton();
//		button.setBounds(20,20,100,50);
//		button.setText("click me");
//		
//		
//		button.setBackground(Color.YELLOW);
//		button.addActionListener((e) -> {
//			this.add(label);
//			
//		});
//		
//		this.add(button);
//		this.setLayout(null);
//		this.setVisible(true);
//		
//		
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new Buttonjava();
//
//	}
//
//}
package pkg1;

import javax.swing.*;
import java.awt.*;

public class Buttonjava extends JFrame {

    Buttonjava() {
        this.setTitle("Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set content pane background color directly
        this.setBackground(Color.BLUE);

        // JLabel
        JLabel label = new JLabel("Hello, this is Jarvis");
        label.setBounds(10, 60, 200, 100);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);

        // JButton
        JButton button = new JButton("Click Me");
        button.setBounds(20, 20, 100, 50);
        button.setBackground(Color.YELLOW);
        button.addActionListener((e) -> {
            // Add label to the content pane
            this.add(label);
            this.revalidate(); // Ensure proper layout update
        });

        // Use layout manager (comment out if you want to use null layout)
        // this.setLayout(new FlowLayout());

        this.add(button);
       // this.setLayout(null); // Comment out if using layout manager
        this.setSize(400, 500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Buttonjava();
    }
}


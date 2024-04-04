package pkg1;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Labeljava extends JFrame {
    
    Labeljava() {
        this.setTitle("Label");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout manager (comment out if you want to use null layout)
        // this.setLayout(new FlowLayout());

        JLabel label = new JLabel();
//        try {
//            // Use ImageIO for reliable image loading
//            ImageIcon image = new ImageIcon(ImageIO.read(new File("C:\\Users\\91845\\javalearning\\src\\pkg1\\i.png")));
//            label.setIcon(image);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
        ImageIcon image = new ImageIcon("C:\\Users\\91845\\javalearning\\src\\pkg1\\i.png");
        label.setIcon(image);

        label.setText("This is bunny");
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setForeground(new Color(0x123456));
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(20, 20, 150, 150); // Adjust the size as needed

        this.add(label);
        //this.pack(); // Pack the frame to ensure preferred size is respected
        //this.setLocationRelativeTo(null); // Center the frame
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Labeljava();
    }
}




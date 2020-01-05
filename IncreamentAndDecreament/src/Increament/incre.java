package Increament;
import javax.swing.*;
import static java.awt.Font.*;
import java.awt.Font;
 public class incre {
 public static void main(String[] args)
 { 
	JFrame frame=new JFrame("Abhishek from Softwarica");
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(300,400);
	frame.setVisible(true);
	JLabel label=new JLabel();
    label.setText("Hello From Abhishek");
    label.setFont(new Font("Cambria",BOLD,50));
    frame.add(label);
    JTextField textField=new JTextField("your text here",20);
    frame.add(textField);
	 frame.pack();
	 
 }
 
 
}


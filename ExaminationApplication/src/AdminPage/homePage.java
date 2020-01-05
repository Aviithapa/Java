package AdminPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class homePage {

	public static void main(String[] args) {
		new Frame();

	}

}
class Frame extends JFrame implements ActionListener{
  JLabel English, Math, Science;
 
 Frame(){
	 JFrame AdminDashBoard=new JFrame();
	 
	 English= new JLabel("English");
	 English.setBounds(100, 200, 50, 50);
	 Math=new JLabel("Math");
	 Science= new JLabel("Science");
	 
	 
	 
	 AdminDashBoard.add(English);AdminDashBoard.add(Math);AdminDashBoard.add(Science);
	 AdminDashBoard.setVisible(true);
	 AdminDashBoard.setSize(400,400);
	 AdminDashBoard.setLayout(null);
 } 
	
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}
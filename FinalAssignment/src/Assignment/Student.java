package Assignment;
import javax.swing.*;
import java.awt.*;
public class Student extends JFrame{
   JButton btnlogin;
   JLabel namelbl,addresslbl,Semlbl;
   JTextField nametxt,addresstxt,Semtxt;
   public static void main(String[] args) {
	   new Student().setVisible(true);
   }
   public Student() {
	   btnlogin=new JButton("Save");
	   
	   namelbl=new JLabel("Name");
	   addresslbl=new JLabel("Address");
	   Semlbl=new JLabel("Sem");
	   
	   
	   nametxt=new JTextField();
	   addresstxt=new JTextField();
	   Semtxt=new JTextField();
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setSize(500,450);
	   setTitle("Student Info System");
	   Container c= getContentPane();
	   c.setLayout(null);
	   
	   
	   namelbl.setBounds(20,20,150,20);
	   nametxt.setBounds(110,20,150,20);
	   
	   Semlbl.setBounds(20,60,150,20);
	   Semtxt.setBounds(110,60,150,20);
	   
	   addresslbl.setBounds(20,100,150,20);
	   addresstxt.setBounds(110,100,150,20);
	   
	   btnlogin.setBounds(80,140,100,30);
	   
	   c.add(namelbl);c.add(nametxt);c.add(Semlbl);c.add(Semtxt);c.add(addresslbl);c.add(addresstxt);c.add(btnlogin);
	   
	   
	   
   }
   
  
}

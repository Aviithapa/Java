package Login;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Login.SignIn;
public class Login {

public static void main(String[] args) {
		new LoginForm();

	}

}

class LoginForm extends JFrame implements ActionListener{
 JLabel l1, UserName, Password;
 JTextField UserNameField;
 JButton login,signin;
 JPasswordField PasswordField;
 LoginForm() {
  JFrame frame = new JFrame("Login Form");
  l1 = new JLabel("Login Form");
  l1.setForeground(Color.blue);
  l1.setFont(new Font("Serif", Font.BOLD, 30));

  UserName = new JLabel("Username");
  Password = new JLabel("Password");
  UserNameField = new JTextField();
  PasswordField = new JPasswordField();
  login = new JButton("Login");
  signin=new JButton("Signin");

  l1.setBounds(150, 40, 400, 50);
  UserName.setBounds(150, 100, 200, 50);
  UserNameField.setBounds(150, 150, 230, 30);
  Password.setBounds(150, 200, 200, 30);
  PasswordField.setBounds(150, 250, 230, 30);
  login.setBounds(150, 320, 110, 30);
  login.addActionListener(this);
  login.addActionListener(this);
  signin.setBounds(270, 320, 110, 30);
  signin.addActionListener(this);

  frame.add(l1);
  frame.add(UserName);
  frame.add(UserNameField);
  frame.add(Password);
  frame.add(PasswordField);
  frame.add(login);
  frame.add(signin);

  frame.setSize(600, 600);
  frame.setLayout(null);
  frame.setVisible(true);
 }
 
 public void actionPerformed(ActionEvent ae)
 {
	 
	 String ch=ae.getActionCommand();
	 String username=UserName.getText();
	 String passsword=Password.getText();
	   if(username.equals("abhi") && password.equals("thapa")) {
		
			 SignIn();
		 }
 }
 }



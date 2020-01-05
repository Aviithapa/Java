package ReserveStringCharacter;
import javax.swing.*; 
public class frame {
 
	 frame(){
			JFrame f= new JFrame("TextField Example");  
		    JTextField t1,t2;  
		    t1=new JTextField("Welcome to Javatpoint.");  
		    t1.setBounds(50,100, 200,30);  
		    t2=new JTextField("AWT Tutorial");  
		    t2.setBounds(50,150, 200,30);  
		    f.add(t1); f.add(t2);  
		    f.setSize(1950,1080);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		}
	 
	public static void main(String args[])  
	    {  
	    new frame();
	    
	    }  
	    
	
}

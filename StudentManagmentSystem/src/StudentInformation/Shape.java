package StudentInformation;

public class Shape {
private int l, b;

public int area()
{
	return l*b;
	}
public int getlenght()
{
return l;	
}
public void setlength(int l1)
{
  l=l1;	
}
public int getbreadth()
{
return b;	
}
public void setbreadth(int b1)
{
 b=b1;	
}

public static void main(String[] args){                                                                                               
Shape MyObj=new Shape();
MyObj.setlength(30);
MyObj.setbreadth(20);
System.out.println(MyObj.area());
}

}

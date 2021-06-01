package pkj2;

public class Class1 
{
	 int a=10;
public  void abc()
{ 
	a=a+1;
	System.out.println("I am the static method with not argument");	
	System.out.println(a);
}
public static void main(String[] args) 
{
	Class1 obj=new Class1();
	obj.abc();
	int b=obj.a+1;
	System.out.println(b);
}
}

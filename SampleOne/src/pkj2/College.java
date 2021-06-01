package pkj2;

public class College extends Student
{
public  College()
{
	
	super(12,23);
	System.out.println("Child Default Parametorized of Child ");
}
public  College(int a)
{
	
	this(23,34,45);
	System.out.println("Child One Parametorized of Colledge");
	
} 
public  College(int a, int b)
{
	this(34);
	System.out.println("Child  Two Parametorized Constructor");
}
public  College(int a, int b, int c)
{
	this();
	System.out.println("Child  Three Parametorized Constructor");
}
public static void main(String[] args) {
	College obj=new College(12,23);
}
}

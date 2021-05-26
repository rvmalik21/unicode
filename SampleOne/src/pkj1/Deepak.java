package pkj1;

public class Deepak 
{
	public Deepak()
	{
		System.out.println("Default Constructor");
	}
	public Deepak(int a, int b, int c)
	{
		this();
		System.out.println("Three parametorized Constructor");
	}
	public Deepak(int a, int b)
	{
		this(34,45,56);
		System.out.println("Two parametorized Constructor");
	}
	public Deepak(int a)
	{
		this(23,45);
		System.out.println("One parametorized Constructor");
	}
	public static void main(String[] args) {
		Deepak obj=new Deepak(23);
	}
}

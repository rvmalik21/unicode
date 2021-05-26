package pkj1;

public class Class2 
	{
	public Class2() 
	{
		System.out.println("Default constructor");
	}
	public Class2(int a)
	{
		System.out.println("One Parametorize constructor");
	}
	public Class2(int a, int b)
	{
		System.out.println("Two Parametorize constructor");
	}
	public Class2(int a, int b, int c)
	{
		System.out.println("Three Parametorize constructor");
	}
	public Class2(float a, int b)
	{
		System.out.println("Two Parametorize constructor with float parametors");
	}
	public static void main(String[] args) 
	{
		new Class2(23.4f,34);
	}
}

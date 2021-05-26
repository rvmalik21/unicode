package pkj1;

public class UseofThis 
	{
	public void method()
	{
		this.method3(12,12,12);
		System.out.println("Default method");	
	}
	public void method1(int a)
	{
		this.method();
		System.out.println("One parametrized method");	
	}
	public void method2(int a,int b)
	{
		this.method4(12, 12, 12, 12);
		System.out.println("Two Parametrized method");	
	}
	public void method3(int a, int b, int c)
	{
		System.out.println("Three parametrized method");
	}
	public void method4(int a, int b, int c,int d)
	{
		this.method1(12);
		System.out.println("Four parametrized method");	
	}
	public static void main(String[] args) 
	{
		UseofThis obj=new UseofThis();
		obj.method2(12,23);
	}
	}

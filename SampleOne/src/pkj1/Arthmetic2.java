package pkj1;
//((((10+2)+2)-2)*2)/2)
public class Arthmetic2 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of expression is;"+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int d;
		d=a-b;
		System.out.println("Result of expression is;"+d);
		return d;
	}
	public int mul(int a, int b)
	{
		int e;
		e=a*b;
		System.out.println("Result of expression is;"+e);
		return e;
	}
	public void div(int a, int b)
	{
		int f;
		f=a/b;
		System.out.println("Result of final expression is;"+f);
	}
	public static void main(String[] args) 
	{
		Arthmetic2 obj=new Arthmetic2();
		int sum1=obj.sum(10, 2);
		int sum2= obj.sum(sum1, 2);
		int sub1=obj.sub(sum2, 2);
		int mul1= obj.mul(sub1, 2);
		obj.div(mul1, 2);
	}
}

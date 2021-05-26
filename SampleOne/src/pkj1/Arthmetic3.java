package pkj1;
//((((10/2)+2)-2)-2)*2)
public class Arthmetic3 
{
	public int sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("Summition of Expression is:"+c);
	return c;
	}
	public int sub(int a, int b)
	{ 
		int d;
		d=a-b;
		System.out.println("Subtraction of Expression is:"+d);
		return d;
	}
	public void mul(int a, int b)
	{ 
		int e;
		e=a*b;
		System.out.println("FINAL RESULT  of Expression is:"+e);
	}
	public int div(int a, int b)
	{ 
		int f;
		f=a/b;
		System.out.println("Division  of Expression is:"+f);
		return f;
	}
	public static void main(String[] args) 
	{
	Arthmetic3 obj=new Arthmetic3();
	int divresult=obj.div(10, 2);
	int sum1=obj.sum(divresult, 2);
	int sub2=obj.sub(sum1, 2);
	int sub3=obj.sub(sub2, 2);
	obj.mul(sub3, 2);
	}
}

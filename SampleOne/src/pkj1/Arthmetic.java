package pkj1;
// (10+2)(10-2)
public class Arthmetic 

	{
		public int sum(int a,int b)
		{
			int c;
			c=a+b;
			System.out.println("Sum is;"+c);
			return c;
		}
		public int sub(int a,int b)
		{
			int d;
			d=a-b;
			System.out.println("subtraction "+d);
			return d;
		}
		public void mul(int a,int b)
		{
			int m;
			m=a*b;
			System.out.println("Result of expression is:"+m);
		}
		public static void main(String[] args) {
			Arthmetic obj=new Arthmetic();
			int sumresult=obj.sum(10, 2);
			int subresult=obj.sub(10,2);
			 obj.mul(sumresult,subresult);
			
		}
	}



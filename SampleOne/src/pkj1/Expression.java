package pkj1;

import java.util.Scanner;

//(((((x1+x2)-x3)+x4)*x5)/x6)
public class Expression 
	{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum is :"+c);
		return c;
	}
	public int sub(int a,int b)
	{
		int d;
		d=a-b;
		System.out.println("Subtraction  is :"+d);
		return d;
	}
	public int mul(int a,int b)
	{
		int e;
		e=a*b;
		System.out.println("Multiplication  is :"+e);
		return e;
	}
	public void  div(int a,int b)
	{
		int f;
		f=a/b;
		System.out.println("REsult  of Expression (x1+x2)-x3)+x4)*x5)/x6)is :"+f);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X1 value");	
		int x1=sc.nextInt();
		System.out.println("Enter the X2 value");
		int x2=sc.nextInt();
		Expression obj=new Expression();
		int sum1=obj.sum(x1, x2);
		System.out.println("Enter the X3 value");
		int x3=sc.nextInt();
		int sub1=obj.sub(sum1, x3);
		System.out.println("Enter the X4 value");
		int x4=sc.nextInt();
		int sum2=obj.sum(sub1, x4);
		System.out.println("Enter the X5 value");
		int x5=sc.nextInt();
		int mul1=obj.mul(sum2, x5);
		System.out.println("Enter the value of X6");
		int x6=sc.nextInt();
		obj.div(mul1,x6);
		sc.close();
	}
	}

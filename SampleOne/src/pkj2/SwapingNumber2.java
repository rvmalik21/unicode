package pkj2;

import java.util.Scanner;

public class SwapingNumber2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter first Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The First Number after Swaping is: "+a);
		System.out.println("The Second Number after Swaping Number is:"+b);
		sc.close();
	}
}

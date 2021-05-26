package pkj2;

import java.util.Scanner;

public class Palendrome 
	{
	public static void main(String[] args) 
	{
		int sum=0,temp,r;
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		temp=a;
		while(a>0) 
			{
			r=a%10;		
			sum=(sum*10)+r;
			a=a/10;
			}
		if(sum==temp)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}
	}

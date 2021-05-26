package pkj2;

import java.util.Scanner;

public class Armstrong 
	{
	public static void main(String[] args) 
	{
		int temp,r,sum=0;
		System.out.println("Enter the Number to check weather it is Armstrong or not :");
		Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				temp=a;
				while (a>0)
				{
					r=a%10;
					sum=sum+(r*r*r);
				a=a/10;
				}
				if(temp==sum)	
				System.out.println("Entered Number is Armstrong :");
				else
					System.out.println("Entered Number is not ArmStrong :");
	}
	}

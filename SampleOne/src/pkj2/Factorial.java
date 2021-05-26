package pkj2;
import java.util.Scanner;
public class Factorial 
	{
	public static void main(String[] args) 
	{
	int fact=1,i;
	System.out.println("Enter the Number to Print the Factorial :");
	Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		sc.close();
		for(i=1;i<=count;i++)
			{
			fact=fact*i;	
			}
		System.out.println("Factorial of " +count +" is " +fact);		
	}
	}

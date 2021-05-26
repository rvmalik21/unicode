package pkj2;

import java.util.Scanner;

public class PrimeNumber 
{
public static void main(String[] args) 
{
	int m,i,flag=0,r;
	System.out.println("Enter any Number to check wheater is it Prime or not: ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	m=a/2;
	if(a==0||a==1) // To check condition of zero and one
		System.out.println("Entered Number is not prime Number: ");	
	else  // To check condition of bigger Number
	{
	for (i=2; i<=m; i++) // main part for concept under for and then if
		{
		if(a%i==0)
		{ 
		System.out.println("Entered Number is not a prime Number ravi:");
		flag=1;  // To Distinges the flag value 
			break;}
		}
	if(flag==0)  // To check flag value 
	{
		System.out.println("Enter Number is Prime Number");
	} }
}
}

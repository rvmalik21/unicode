package pkj2;

import java.util.Scanner;

public class Fibonacii 
{
public static void main(String[] args) 
{
	int n1=0,n2=1,n3,count,i;
	System.out.println("Enter the value of terms that you want to print the Fibonacii :");
	Scanner sc=new Scanner(System.in);
			count =sc.nextInt();
			System.out.print(n1+" "+n2);
			for(i=2;i<count;i++)
			{
				n3=n2+n1;
				n1=n2;
				n2=n3;
				System.out.print(" "+n3);
			}
		
}	

}

package pkj2;

import java.util.Scanner;

public class Table 
	{
	public static void main(String[] args) 
	{
		int i;
		System.out.println("Enter the Number of which you want to print the Table :");
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				sc.close();
				System.out.println("Here your Table ");
		for(i=1;i<=10;i++)
		{
			int tab=n*i;
			System.out.println(n +"*"+i+"="+tab);
		}
		
	}
	
	
}
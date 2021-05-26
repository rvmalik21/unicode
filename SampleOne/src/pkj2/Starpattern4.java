package pkj2;

public class Starpattern4 {
	public static void main(String[] args) {
	int a=8,j,i;
	for(i=1;i<=a;i++)
	{
		for (j=(a-i); j>=1; j--)  
		{
			System.out.print(" ");
		}	
		
		for( j=1;j<=i;j++) 
		{
		System.out.print("* ");
		}
		System.out.println(" ");
	}
}
}
package pkj2;
public class Starpattern6 {
	public static void main(String[] args) {
		int a=4,i,j,count=1;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

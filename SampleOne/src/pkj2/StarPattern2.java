package pkj2;

public class StarPattern2 {
	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

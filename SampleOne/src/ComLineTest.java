//This program uses Commnad Line
// arguments as input.c
class ComLineTest {
	public static void main(String[] args)
	{
		int count, i=0;
		String string;
		count=args.length;
		System.out.println ("Numbers of arguments="+count);
		while(i<count)
		{
			string=args[i];
			i=i+1;
			System.out.println (i+":"+"java is" +string +"!");
		}
	
	}

}

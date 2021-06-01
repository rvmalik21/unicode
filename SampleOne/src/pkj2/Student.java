package pkj2;

public class Student 
{
public Student()
{
	System.out.println(" Parent Default Constructor");
}
public Student(int a)
{
	
	System.out.println("Parent  one parametorized Constructor");
}
public Student(int a, int b)
{
	System.out.println("Parent Two parametorized Constructor");
}
public Student(int a, int b, int c)
{
	System.out.println("Parent Three parametorized Constructor");
}
public static void main(String[] args) 
{
	
	Student obj=new Student();
	//System.out.println("This is main method of Student Class");
}
}

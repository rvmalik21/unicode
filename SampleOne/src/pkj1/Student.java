package pkj1;

public class Student 
{
	int age;
	int rollNum;
	public void method1()
	{
		System.out.println("Welcome to java");
	}
	public void method2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.age=29;
		obj1.rollNum=1002913076;
		System.out.println("Your age is:" +obj1.age);
		System.out.println("Your roll Number is:" +obj1.rollNum);
		obj1.method1();
		obj1.method2();
	}
}


// A program with multiple classes

public class RoomArea {
	public static void main(String[] args) {
		float area;
		Room rm1=new Room();
		rm1.getdata(14.10f,10.50f);
		area=rm1.length*rm1.breadth;
		System.out.println("Area of Room is :"+area);
	}
}
class Room
{
	float length;
	float breadth;	
	void getdata(float a, float b)
	{
		length=a;
		breadth=b;
	}
}
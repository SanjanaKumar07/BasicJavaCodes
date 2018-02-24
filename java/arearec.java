import java.util.*;

class Area
{
	float a,b;
	Area()
	{
		a=0;
		b=0;
	}

	Area(float x,float y)
	{
		a=x;
		b=y;
	}

	void area()
	{
		float area = a * b;
		System.out.println("area of rectangle is "+area); 
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sides of rectangle : ");
		float a = sc.nextInt();
		float b = sc.nextInt();
		Area obj = new Area(a,b);
		obj.area();
	}
}
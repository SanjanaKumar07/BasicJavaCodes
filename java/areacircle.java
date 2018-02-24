import java.util.*;

class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle : ");
		float a = sc.nextInt();
		float area = 3.14f * a * a;
		System.out.println("area of circle is "+area); 
	}
}
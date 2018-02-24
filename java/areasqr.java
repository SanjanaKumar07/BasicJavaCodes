import java.util.*;

class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side of square : ");
		float a = sc.nextInt();
		float area = a * a;
		System.out.println("area of square is "+area); 
	}
}
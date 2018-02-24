import java.util.*;

class Greater
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers : ");
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = (a>b)? a:b;
		System.out.println("Greater number is "+c); 
	}
}
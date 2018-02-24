import java.util.*;

class Temp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temp in F : ");
		float a = sc.nextInt();
		float temp = (a-32)*(5.0f/9);
		System.out.println("temp in C "+temp); 
	}
}
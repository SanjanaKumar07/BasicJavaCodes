import java.util.*;

class Si
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal, rate, time : ");
		float p = sc.nextInt();
		float r = sc.nextInt();
		float t = sc.nextInt();
		System.out.println("SI is "+(p*r*t/100)); 
	}
}
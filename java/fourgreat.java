import java.util.*;
import java.lang.*;

class Fourgreat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e;
		e=Math.max(a,Math.max(b,Math.max(c,d)));
		System.out.println("Maximum of four numbers is "+e);
	}
}
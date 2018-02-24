import java.util.*;

class Power
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number and power to find : ");
		int x = sc.nextInt();
		int n = sc.nextInt();
		int i,p=1;
		for(i=1;i<=n;i++)
			p=x*p;
		System.out.println("Power is "+p);
	}
}
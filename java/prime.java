import java.util.*;
import java.lang.Math;

class Prime
{
	int f=0;
	int i=2,x;
	Prime()
	{
		x=0;
	}
	Prime(int y)
	{
		x=y;
	}

	void check(int x)
	{
		double val = Math.sqrt(x);
		while(i<=val)
		{
			if(x%i==0)
				f++;
			i++;
		}
		if(x==1)
			System.out.println("Is not prime");
		else if(f==0)
			System.out.println("Is prime");
		else 
			System.out.println("Is not prime");
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int x = sc.nextInt();
		Prime obj=new Prime(x);
		obj.check(x);
	}
}
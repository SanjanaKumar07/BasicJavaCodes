import java.util.*;

class Suminp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int x = sc.nextInt();
		int sum=0;
		while(x!=0)
		{
			sum+=(x%10);
			x=x/10;
		}
		System.out.println("Sum is "+sum);
	}
}
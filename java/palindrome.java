import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int x = sc.nextInt();
		int i,sum=0,y=x;
		while(x!=0)
		{
			sum=sum*10+(x%10);
			x=x/10;
		}
		x=y;
		int a,b,f=0;
		while(x!=0)
		{
			a=x%10;
			b=sum%10;
			if(a!=b)
			{
				f=1;
				break;
			}
			x=x/10;
			sum=sum/10;
		}
		if(f==0)
			System.out.println("Is palindrome");
		else 
			System.out.println("Is not palindrome");
	}
}
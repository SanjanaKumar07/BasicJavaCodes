import java.util.*;

class All
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		System.out.println("enter a choice : ");
		int f = sc.nextInt();
		int i;
		if(f==1)
		{
			for(i=1;i<=n;i++)
				System.out.println(i*2);
		}
		else if(f==2)
		{
			for(i=1;i<=n;i++)
				System.out.println(i*2-1);
		}
		else if(f==3)
		{
			for(i=1;i<=n;i++)
					System.out.println(i*i);	
		}
		else if(f==4)
		{
			for(i=1;i<=10;i++)
					System.out.println(i*n);
		}
		else
			System.out.println("Invalid Choice");
	}
}
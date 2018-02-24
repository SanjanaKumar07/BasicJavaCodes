import java.util.*;

class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an age : ");
		int a = sc.nextInt();
		if(a>=18)
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
	}
}
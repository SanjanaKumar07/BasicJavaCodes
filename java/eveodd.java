import java.util.*;

class Eveodd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		boolean c = ((a&1)==1)? true:false;
		if(c)
			System.out.println("Number is Odd");
		else 
			System.out.println("Number is Even");
	}
}
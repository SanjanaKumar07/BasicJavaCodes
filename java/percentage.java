import java.util.*;

class Percent
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter %age : ");
		int m = sc.nextInt();
		if(m<=100 && m>=60)
			System.out.println("1st division");
		else if(m<60 && m>=50)
			System.out.println("2nd division");
		else if(m<50 && m>=40)
			System.out.println("3rd division");
		else if(m<40 && m>=0)
			System.out.println("Fail");
		else 
			System.out.println("Invalid %age");
	}
}
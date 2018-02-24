import java.util.*;

class Marriage
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter male and female age : ");
		int m = sc.nextInt();
		int f = sc.nextInt();
		if(m>=21)
			System.out.println("Male eligible for marriage");
		else
			System.out.println("Male is not eligible");
		if(f>=18)
			System.out.println("Female eligible for marriage");
		else
			System.out.println("Female is not eligible");
	}
}
import java.util.*;
//import java.io.*;

class Test
{
	public static void main(String args[])
	{
		int d,a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\tCalculator Starts\n");
		while(true)
		{
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 for modulus");
			System.out.println("Press 6 to exit");
			//System.out.println("Press 1 for addition");
			c=sc.nextInt();
			if(c!=6)
			{
				System.out.println("Enter first number");
				a=sc.nextInt();
				System.out.println("Enter second number");
				b=sc.nextInt();
				if(c==1)
				{
					d=a+b;
					System.out.println("Addition of numbers is "+d);
				}
				else if(c==2)
				{
					d=a-b;
					System.out.println("Subtraction of numbers is "+d);
				}
				else if(c==3)
				{
					d=a*b;
					System.out.println("Multiplication of numbers is "+d);
				}
				else if(c==4)
				{
					d=a/b;
					System.out.println("Division of numbers is "+d);
				}
				if(c==5)
				{
					d=a%b;
					System.out.println("Modulus of numbers is "+d);
				}
			}
			else
				break;
			System.out.println("\t\t\t\tCalculator Restarts\n");
		}
		//System.out.println(a+b); 
	}
}

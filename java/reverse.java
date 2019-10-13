import java.util.*;

public class Main
{
	public static void main(String args[])
	{
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String n = sc.nextLine();
	
	 StringBuffer sb = new StringBuffer(n);
	 sb.reverse();
	 System.out.println("Reversed string is " +sb);
	}
}

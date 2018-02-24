import java.util.*;
import java.lang.Math;

class Maxinarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int temp,m=0;
		for(i=0;i<n;i++)
			m=Math.max(m,a[i]);
		System.out.println(m);
	}
}
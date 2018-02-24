import java.util.*;
import java.lang.Math;

class Reversearray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int temp;
		for(i=0;i<(n/2);i++)
		{
			temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
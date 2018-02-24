import java.util.*;

class Selectionsort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int i,j;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int minindex,temp,m=0;
		for(i=0;i<n-1;i++)
		{
			minindex=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[minindex])
				{
					temp=a[minindex];
					a[minindex]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
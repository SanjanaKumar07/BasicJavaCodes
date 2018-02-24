package pack2;

public class Userexception extends Exception
{
	int st;
	public Userexception(int a)
	{
		st=a;
	}
	public String toString()
	{
		return st+" greater than 100 Exception";
	}	
}
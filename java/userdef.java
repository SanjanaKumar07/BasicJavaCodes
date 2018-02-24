class Userexception extends Exception
{
	public Userexception(String msg)
	{
		super(msg);
	}
}


class Test
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		try
		{
			if(a>100)
				throw new Userexception("Number greater than 100 exception");
			System.out.println(a);
		}
		catch(Userexception e)
		{
			System.out.println(e);
		}
	}
}
import pack2.*;
class Test
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		try
		{
			if(a>100)
				throw new Userexception(a);
			System.out.println(a);
		}
		catch(Userexception e)
		{
			System.out.println(e);
		}
	}
}
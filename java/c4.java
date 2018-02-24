class Test
{
	static void m()
	{
		System.out.println("Hello its m");
	}
	/*void m()
	{
		System.out.println("Hello its m");
	}Same for non static methods */
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		ob1.m();
	}
}
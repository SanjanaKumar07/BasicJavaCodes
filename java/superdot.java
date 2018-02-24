class Test
{
	int x;
	Test(int x1)
	{
		x=x1;
	}
	void display()
	{
		System.out.println("Test X="+x);
	}
}
class Test1 extends Test
{
	int x;
	Test1(int x1,int y1)
	{
		super(x1);
		x=y1;
	}
	void display()
	{
		super.display();
		System.out.println("Test1 X="+x);
	}
}
class Test2 extends Test1
{
	int x;
	Test2(int x1,int y1,int z1)
	{
		super(x1,y1);
		x=z1;
	}
	void display()
	{
		super.display();
		System.out.println("Test2 X="+x);
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Test t = new Test(8);
		Test1 t1 = new Test1(2,6);
		Test2 t2 = new Test2(5,9,10);
		t.display();
		t1.display();
		t2.display();
	}
}
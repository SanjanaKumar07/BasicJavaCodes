class Test implements Runnable
{
	Thread th;
	String name;
	Boolean b;
	Test(String msg)
	{
		name=msg;
		b=false;
		th=new Thread(this,name);
		th.start();
	}
	public void run()
	{
		System.out.println(name+" Thread start");
		try
		{
			for(int i=0;i<50;i++)
			{
				System.out.println(name+'='+i);
			Thread.sleep(4000);
			synchronized(this)
			{
				while(b)
					wait();
			}
		}
		}
		catch(Exception e){}
	}
	public void blockedOn()
	{
		b=true;
	}
	public void blockedOff()
	{
		b=false;
		notify();
	}
}

class TestMain
{
	public static void main(String args[])
	{
		Test t1=new Test("First");
		Test t2=new Test("Second");
		try
		{
			t1.blockedOn();
			Thread.sleep(2000);
			t1.blockedOff();
			t2.blockedOn();
			Thread.sleep(4000);
			t2.blockedOff();
		}
		catch(Exception e){}
	}
}
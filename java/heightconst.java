class Height
{
	int ft,in;

	Height()
	{
		ft=0;
		in=0;
	}

	Height(int f,int i)
	{
		ft=f;
		in=i;
	}
	
	void setData(int a,int b)
	{
		this.ft=a;
		this.in=b;
	}

	Height addHeight(Height h)
	{
		Height h3 = new Height();
		h3.ft=ft+(h.ft);
		h3.in=in+(h.in);
		if(in>12)
		{
			h3.ft=h3.ft+(h3.in/12);
			h3.in=h3.in%12;
		}
		return h3;
	}

	void display()
		System.out.println(ft + " " + in);
}
class Testmain
{
	public static void main(String[] args)
	{
		Height h1=new Height();
		h1.setData(5,13);
		h1.display();
		Height h2=new Height(9,11);
		h2.display();
		Height h3=new Height();
		h3=h1.addHeight(h2);
		h3.display();
	}
}
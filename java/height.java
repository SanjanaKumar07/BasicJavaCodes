class Height
{
	int ft,in;
	
	void setData(int a,int b)
	{
		this.ft=a;
		this.in=b;
	}

	void addHeight(Height h1,Height h2)
	{
		ft=(h1.ft)+(h2.ft);
		in=(h1.in)+(h2.in);
		if(in>12)
		{
			ft=ft+(in/12);
			in=in%12;
		}
	}

	void display()
	{
		System.out.println(ft + " " + in);
	}
}
class Test
{
	public static void main(String[] args)
	{
		Height h1=new Height();
		h1.setData(5,13);
		h1.display();
		Height h2=new Height();
		h2.setData(9,11);
		h2.display();
		Height h3=new Height();
		h3.addHeight(h1,h2);
		h3.display();
	}
}
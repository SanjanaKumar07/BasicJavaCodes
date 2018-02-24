class Area
{
	int l,b;
	Area(int l1,int b1)
	{
		l=l1;
		b=b1;
	}
	int areaRec()
	{
		return (l*b);
	}
}
class Volume extends Area
{
	int h;
	Volume(int l1,int b1,int h1)
	{
		super(l1,b1);
		h=h1;
	}
	int volRec()
	{
		return (l*b*h);
	}
}
class Density extends Volume
{
	double m;
	Density(int l1,int b1,int h1,double m1)
	{
		super(l1,b1,h1);
		m=m1;
	}
	double densityRec()
	{
		return (m/volRec());
	}
}
class Test
{
	public static void main(String args[])
	{
		Density d = new Density(5,4,8,320);
		System.out.println(d.densityRec());
	}
}
class Test
{
	/*public String toString(String s)
	{
		return s;
	}*/
	public static void main(String args[])
	{
		String s1="abc";
		String s2="abcd";
		String s3 = new String("abc");
		int i = s2.compareTo(s1);
		System.out.println(i);
		if(s1==s2)
			System.out.println("Hi");
		else
			System.out.println("Bye");
		if(s1==s3)
			System.out.println("Hi");
		else
			System.out.println("Bye");
		System.out.println(s1);
		s1=s1.concat(s2);
		//System.out.println(getInstance(s1));
	}
}
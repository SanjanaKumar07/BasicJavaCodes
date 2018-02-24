class Test{
	int i=0;
	static int j=0;
	public static void main(String args[]){
		Test t = new Test();
		System.out.println("For t");
		t.show();
		t.m();
		t.show();
		Test tnew = new Test();
		System.out.println("For tnew");
		tnew.show();
		tnew.m();
		tnew.show();
	}
	void m(){
		i++;
		j++;
	}
	void show(){
		System.out.println(i);
		System.out.println(j);
	}
}
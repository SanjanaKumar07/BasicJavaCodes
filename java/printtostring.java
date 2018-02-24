class Employee
{
	int id,sal;
	String nm;
	Employee(int id1, String name, int salary)
	{
		this.id=id1;
		this.nm=name;
		this.sal=salary;
	}
	public String toString(String s)
	{
		return "id="+this.id+" name="+this.nm+" salary"+this.sal;
	}
	public static void main(String args[])
	{
		Employee emp = new Employee(101,"Ram",2500);
		System.out.println(emp);
	}
}
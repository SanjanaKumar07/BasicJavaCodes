import java.io.*;

class Employee implements Serializable
{
	int id,sal;
	String name;
	public Employee(int id1,String nm,int sal1)
	{
		sal=sal1;
		id=id1;
		name=nm;
	}
	public String toString()
	{
		return "id = "+id+" name = "+name+" sal = "+sal;
	}
}

class Fil {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File fobj= new File("f3.txt");
        FileOutputStream fos=new FileOutputStream(fobj);
        FileInputStream fis=new FileInputStream(fobj);
        Employee el=new Employee(101,"Ram",35000);
        //System.out.println(el);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeOject(el);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee e=(Employee)ois.readObject();
        System.out.println(e);
        /*int x;
        String s="Himanshu";
        fos.write(s.getBytes());
        while((x=fis.read())!=-1)
        {
        	System.out.println((char)x);
        }*/
        /*DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(65);
        dos.writeDouble(65.3);
        DataInputStream dis=new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());*/
    }   
}
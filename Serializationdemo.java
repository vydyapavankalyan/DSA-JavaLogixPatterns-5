import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	int empno;
	String name;
	float salary;
	String designation;
	transient int SSN;
	Employee(int empno,String name,float salary,String designation,int SSN)
	{
		this.empno=empno;		
		this.name=name;
		this.salary=salary;
		this.designation=designation;	
		this.SSN=SSN;
	}
}
class Serializationdemo
{
	public static void main(String args[]) throws IOException
	{
		
		Employee e=new Employee(1234,"sachin",56000.45f,"manager",543865);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;

		try
		{
			fos=new FileOutputStream("E:employ.ser");
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject((Object)e);
		}
				
		finally
		{
			if(oos!=null)
				oos.close();
			if(fos!=null)
				fos.close();
		}
	}
	
}		

		
			
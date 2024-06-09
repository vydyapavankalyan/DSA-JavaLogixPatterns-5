import java.io.*;
class First
{
	void display()
	{
		System.out.println("Hello");
	}
	void print()
	{
		System.out.println("HI");
	}
}
class Second extends First
{
	void display()
	{
		System.out.println("BYE");
	}
	void show()
	{
		System.out.println("SEE YOU");
	}
}
class Referencetypes
{
	public static void main(String args[])
	{
		//First f=new First();
		//f.display();
		//f.print();

		// Second s=new Second();
		 // s.display();
		  //s.print();
		  //s.show();

		//First f=(First)new Second(); //upcasting
		//	f.display();
		//	f.print();
			//f.show();

			//Second s=(Second)new First(); //Downcasting cause runtime Classcast Exception

			// Resolved with the following apporach
			First f=(First)new Second();
			Second s=(Second)f;

			s.display();
			s.print();
			s.show();
			
	}
}
import java.util.*;
import java.io.*;
class Sample
{
	public static void main(String args[])
	{
		try
		{
			int a=20,b=0,c;  //more than one same exception in one try  block is not allowed.
			c=a/b;
			System.out.println(c);
			int x=20,y=0,z;
			z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("b should not be zero");
		}
		
		System.out.println("close the program");
	}
}
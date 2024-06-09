import java.util.*;
class Reverserec
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int n=12345;

		reverse(n); //calling method
		

	}

	static void reverse(int n)  //called method
	{
			if(n>0)
			{
			  System.out.print(n%10);
			  reverse(n/10);
			}
	}
		
}
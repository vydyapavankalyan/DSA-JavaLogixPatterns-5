import java.util.*;
class Sodrec
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int n=12345,result;

		result=sum_of_digits(n); //calling method
		System.out.println("sum of individual digits="+result);

	}

	static int sum_of_digits(int n)  //called method
	{
			if(n>0)
			  return(n%10 + sum_of_digits(n/10));
			else
			  return n;
	}
		
}
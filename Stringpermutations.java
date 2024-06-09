import java.util.*;
class Stringpermutations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;

		System.out.println("enter the string");
		str=sc.next();
		permutations(str); //calling1 method
	}
	static void permutations(String str) //called1 method
	{
		int n=str.length();
		int f=factorial(n); //calling2 method

		for(int i=0;i<f;i++)
		{
			StringBuffer s=new StringBuffer(str);
			int temp=i;
			for(int div=n;div>=1;div--)
			{
				int q=temp/div;
				int r=temp%div;
				
				System.out.print(s.charAt(r));
				s.deleteCharAt(r);
			
			     temp=q;
			}
			System.out.println("");
		}

	}
	static int factorial(int n) //called2 method
	{
		int fact=1,i;

		if(n==0)
		     fact=1;		
		else
		{
			for(i=1;i<=n;i++)
			  fact=fact*i;
		}
		return fact;
	}
		
}
		

		
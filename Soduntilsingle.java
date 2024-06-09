import java.util.*;
class Soduntilsingle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int n,rem,sum=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		while(n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
				
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum="+sum);
	}
}
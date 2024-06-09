import java.util.*;
class Strongnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,temp,rem,sum=0,fact;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		temp=n;

		for(;temp>0;)
		{
			rem=temp%10;
			if(rem==0)
			    fact=1;
			else
			{
				fact=1;
				for(i=1;i<=rem;i++)
				   fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==n)
			System.out.println(n+"is a strong number");
		else
			System.out.println(n+"is not a strong number");
			
			
	}
}
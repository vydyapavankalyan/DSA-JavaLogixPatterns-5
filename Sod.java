import java.util.*;
class Sod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,rem,sum=0;

		System.out.println("Enter the value of n");
		n=sc.nextInt();

		while(n>0)
		{
			rem=n%10;	
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of individual digits="+sum);
	
	}
}
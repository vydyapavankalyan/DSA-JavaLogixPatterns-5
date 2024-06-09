import java.util.*;
class Series2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,sum=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=2*n;i=i+2)
			sum=sum+i*(i+1);
		System.out.println("sum of the series="+sum);
	}
}
import java.util.*;
class Series
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,k=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		k=k-n; //k=-5;
		n=n+1; //n=6;

		while(k!=n)
		{
			System.out.print(Math.abs(k)+" ");
			k++;
		}
	}
}
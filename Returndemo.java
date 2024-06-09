import java.util.*;
class Returndemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			if(i==5)
			   continue;
			else
			  System.out.print(i+" ");
		}
	}
}
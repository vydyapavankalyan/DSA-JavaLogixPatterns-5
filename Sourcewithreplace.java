import java.util.*;
class Sourcewithreplace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[20];
		int i,n,selement,relement;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the source element");
		selement=sc.nextInt();

		System.out.println("enter the replace element");
		relement=sc.nextInt();

		for(i=0;i<n;i++)
		  {
			if(a[i]==selement)
			   a[i]=relement;
		  }

		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}
}

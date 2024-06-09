import java.util.*;
class Secondlargest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];
		int i,n,largest1,largest2;

		System.out.println("enter the size of array a");
		n=sc.nextInt();
		
		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		largest1=a[0];

		for(i=1;i<n;i++)
		{
			if(a[i]>largest1)
			largest1=a[i];
		}

		largest2=-9999;
		for(i=0;i<n;i++)
		{
			if(a[i]>largest2 && a[i]!=largest1)
				largest2=a[i];
		}
		System.out.println("Second largest element in an array="+largest2);
	}
}
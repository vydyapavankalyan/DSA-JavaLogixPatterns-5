import java.util.*;
class Sequentialsearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[20];
		int i,n,pos=0,keyelement,found=0;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the keyelement to be searched");
		keyelement=sc.nextInt();

		for(i=0;i<n;i++)
		  {
			if(keyelement==a[i])
			{
				found=1;
				pos=i;
				break;
			}
			
		  }

		if(found==1)
			System.out.println("Search is successful! Keyelement found at:"+pos);
		else
			System.out.println("Search is unsuccessful! Keyelement not found");

	}
}

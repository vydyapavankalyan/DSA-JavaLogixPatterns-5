import java.util.*;
class Secondrepeatedelement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[10];
		int n,i,j,fre,sre;

		System.out.println("enter the size of array a and b");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		fre=-1;
		sre=-1;

		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					if(fre==-1)
					    fre=a[i];
					else if(a[i]!=fre)
					{
						sre=a[i];
						break;
					}
				}
			}
			if(sre!=-1)
			   break;
		}
		if(sre!=-1)
			System.out.println("second repeated element="+sre);
		else
			System.out.println("no such element exist in array a");

		
	}
}
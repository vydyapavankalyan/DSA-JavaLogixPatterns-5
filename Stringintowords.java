import java.util.*;
class Stringintowords
{
public static void main(String args[])
	{
		String s="welcome to java full stack programme";

		String a[]=s.split(" ");

		int i;
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);

		
	}
}
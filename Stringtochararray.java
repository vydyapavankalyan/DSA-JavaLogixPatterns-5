import java.util.*;
class Stringtochararray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String s="sathya";

		char ch[]=s.toCharArray();

		int i;
		for(i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		
	}
}
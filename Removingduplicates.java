import java.util.*;
class Removingspaces
{
	public static void main(String args[])
	{
		String s="welcome  to    satya       technology";
		String s1="";
		char ch;
		int i;

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
			   s1=s1+ch;
			else
			{
			   if(s.charAt(i+1)!=' ')
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}
}
import java.util.*;
class Sidebyside
{
	public static void main(String args[])
	{
		String s="abcde";
		String s1="";
		int i;

		for(i=0;i<s.length();i=i+2)
		{
			if(i+2<=s.length())
				s1=s1+s.charAt(i+1)+s.charAt(i);
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}
		
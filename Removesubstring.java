import java.util.*;
class Removesubstring
{
	public static void main(String args[])
	{
		String s="welcome to satya technologies";
		String substr="technologies";
		String str[]=s.split(" ");
		String s1="";
		int i;

		for(i=0;i<str.length;i++)
		{
			if(str[i].equals(substr))
				continue;
			else
				s1=s1+" "+str[i];
		}	
		System.out.println(s1);

		
	}
}
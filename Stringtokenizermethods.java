import java.util.*;
class Stringtokenizermethods
{
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer("Welcome to java full stack programme");
		
	System.out.println(st.countTokens());
	while(st.hasMoreElements()) //hasMoreTokens()
	{
		System.out.println(st.nextElement()); //nextElement()	
	}
	
}
}
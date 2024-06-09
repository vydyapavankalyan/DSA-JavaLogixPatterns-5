import java.util.*;
class Stringmethods
{
	public static void main(String args[])
	{
		String s="welcome to java full stack developers";
		
		System.out.println(s.charAt(6));
		String s1=s.concat("Infosys");
		System.out.println(s1);
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]+" ");
		System.out.println(s.equals(s1));
		String s2="satya";
		String s3="SATYA";
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s.length());
		System.out.println(s.replace('e','a'));
		System.out.println(s.substring(4,10));
		System.out.println(s.substring(6));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		String s4="JAVA WORLD";
		System.out.println(s4.toLowerCase());
		System.out.println(s.toUpperCase());
		String ch1[]=s4.split(" ");
		for(int i=0;i<ch1.length;i++)
			System.out.println(ch1[i]);

	}
}
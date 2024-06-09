import java.util.*;
class Stringpalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s,s1="";
		int i;

		System.out.println("enter the string");
		s=sc.next();

		for(i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}
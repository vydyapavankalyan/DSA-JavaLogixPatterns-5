import java.util.*;
class Stringbuildermethods
{
	public static void main(String args[])
	{
		StringBuilder sb=new StringBuilder();
		sb.append("welcome");
		System.out.println(sb.capacity());
		sb.append(" to java technologies ameerpet hyderabad");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(4));
		System.out.println(sb.length());
		System.out.println(sb.insert(5,"bye"));
		System.out.println(sb.insert(3,'z'));
		System.out.println(sb.delete(5,10));
		System.out.println(sb.deleteCharAt(8));
		System.out.println(sb.reverse());
		sb.setCharAt(1,'x');
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("welcome to java world");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
	}
}
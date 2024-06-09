import java.util.*;
class Stringbuffermethods
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		sb.append("welcome to java technology. welcome to saty a academy happy learning good bye");
		// new_capacity = old_capacity*2 +2;
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(9));
		System.out.println(sb.length());
		System.out.println(sb.insert(6,"bye"));
		System.out.println(sb.insert(8,'z'));
		System.out.println(sb.delete(5,15));
		System.out.println(sb.deleteCharAt(7));
		sb.setCharAt(10,'x');
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuffer sb1=new StringBuffer("happy coding");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());

	}
}
import java.util.*;
class Stringdemo2
{
	public static void main(String args[])
	{
		String s1="worldcup"; //string literal
		String s2=new String("worldcup").intern();
		String s3="cricket";
		String s4=new String("game").intern();
		String s5=new String("game").intern();

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
		
	}
}
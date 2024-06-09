import java.util.*;
class Specialsymbol
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;

		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		if(!((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')))
			System.out.println("special symbol");
		else
			System.out.println("not a special symbol");
	}
}
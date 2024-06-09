import java.util.*;
class Simplecalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,add,sub,mul,div,mod;
		char choice;

		System.out.println("**********SIMPLE CALCULATOR*********");
		System.out.println("+:ADDITION");
		System.out.println("-:SUBTRACTION");
		System.out.println("*:MULTIPLICATION");
		System.out.println("/:DIVISION");
		System.out.println("%:MODULUS");

		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.println("Enter the choice");
		choice=sc.next().charAt(0);

		switch(choice)
		{
			case '+': add=a+b;
				  System.out.println("Addition of two numbers="+add);
				  break;
			case '-': sub=a-b;
				  System.out.println("Subtraction of two numbers="+sub);
				  break;
			case '*': mul=a*b;
				  System.out.println("multiplication of two numbers="+mul);
				  break;
			case '/': div=a/b;
				  System.out.println("quotient of two numbers="+div);
				  break;
			case '%': mod=a%b;
				  System.out.println("remainder of two numbers="+mod);
				  break;
			default:  System.out.println("Invalid option");
		}
	}
}
		
	

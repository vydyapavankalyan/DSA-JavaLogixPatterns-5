import java.util.*;
class Simpleinterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int principle_amount,time_period;
		float rate_of_interest,SI;

		System.out.println("enter the principle amount");
		principle_amount=sc.nextInt();

		System.out.println("enter the time period");
		time_period=sc.nextInt();

		System.out.println("enter the rate of interest");
		rate_of_interest=sc.nextFloat();

		SI=(principle_amount*time_period*rate_of_interest)/100;
		

		System.out.println("simple interest="+SI);
		

	}
}
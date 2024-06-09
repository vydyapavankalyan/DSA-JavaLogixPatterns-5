import java.util.*;
class Stringjoinermethods
{
	public static void main(String args[])
	{
		StringJoiner sj=new StringJoiner(",");

		sj.add("sachin");
		sj.add("rahul");
		sj.add("kapil");
		sj.add("dravid");

		System.out.println(sj);
		
		StringJoiner sj1=new StringJoiner(",");

		sj1.add("sehwag");
		sj1.add("kohli");

		System.out.println(sj1);

		System.out.println(sj.merge(sj1));
	
	}
}
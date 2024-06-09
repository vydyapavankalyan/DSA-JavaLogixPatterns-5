import java.io.*;
import java.lang.*;
		
class Runnabledemo
{
	public static void main(String args[]) throws Exception
	{
		Runnable m=new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println("Good morning");
					}
					catch(Exception e)
					{
					}
				}
			}
		};
	
		Runnable e=new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println("Good evening");
					}
					catch(Exception e1)
					{
					}
				}
			}
		};
	
		

		Thread t1=new Thread(m);
		try
		{
		Thread.sleep(50);
		}
		catch(Exception e1)
		{
		}
		Thread t2=new Thread(e);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Bye Bye");
	}
}	
package MultiThreading;


class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("I: "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+ e);
		}
	}
}



class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("J: "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+ e);
		}
	}
}


class C extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("K: "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+ e);
		}
	}
}

public class demo1 {
	 
	public static void main(String[] args) {
		
		A a=new A();
		a.start();
		B b=new B();
		b.start();
		C c=new C();
		c.start();
		
	}

}

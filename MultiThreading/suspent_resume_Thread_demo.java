package MultiThreading;

class abc1 extends Thread
{
	public synchronized void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				if(Thread.currentThread().getName().equals("Rama"))
				{
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				if(Thread.currentThread().getName().equals("Seetha"))
				{
					System.out.println("      "+Thread.currentThread().getName()+":"+i);
				}
				
			}
		}
		catch(Exception e)
		{}
	}
}
public class suspent_resume_Thread_demo {

}

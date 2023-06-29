package MultiThreading;

class abc extends Thread
{
	public synchronized void run()
	{
		try
		{
			for(int i=0;i<=50;i++)
			{
				if(Thread.currentThread().getName().equals("BMW"))
				{
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				if(Thread.currentThread().getName().equals("BENZ"))
				{
					System.out.println("      "+Thread.currentThread().getName()+":"+i);
				}
				if(Thread.currentThread().getName().equals("Maruti"))
				{
					System.out.println("            "+Thread.currentThread().getName()+":"+i);
				}
				
			}
		}
		catch(Exception e)
		{}
	}
}

public class SynchronisationThred {
	public static void main(String[] args) {
		
		abc a=new abc();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		
		t1.setName("BMW");
		t2.setName("BENZ");
		t3.setName("Maruti");
		
		/*t1.setPriority(10);
		t2.setPriority(9);*/
		
		System.out.println("Name of Thread t1 is:"+ t1.getName());
		System.out.println("Name of Thread t2 is:"+ t2.getName());
		System.out.println("Name of Thread t3 is:"+ t3.getName());
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		for(int i=0;i<50;i++)
		{
			try
			{
						System.out.println("                            k:"+i);
						if(i==5)
						{
							t1.suspend();
						}
						if(i==10)
						{
							t2.suspend();
						}
						if(i==15)
						{
							t3.suspend();
						}
						if(i==20)
						{
							t1.resume();
						}
						if(i==25)
						{
							t2.resume();
						}
						if(i==30)
						{
							t3.resume();
						}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured:"+e);
				
			}
		}
		
		
	}

}

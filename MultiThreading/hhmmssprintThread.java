package MultiThreading;


class S
{
	int hh=0;
	int mm=0;
	int ss=0;
	
	
	void dis()
	{
		try
		{
			for(int i=0;i<10000;i++)
			{
				
				System.out.print(hh+":"+mm+":"+i+"  ");
				Thread.sleep(10);
				if(i%60==0)
				{
					mm++;
					i=0;
				}
				if(i%3600==0)
				{
					hh++;
				}
				System.out.flush();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Some exception occured:"+e);
		}
	}
}

public class hhmmssprintThread {
	public static void main(String[] args) {
		S s=new S();
		s.dis();
		
	}

}

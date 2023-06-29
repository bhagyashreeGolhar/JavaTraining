


class xyz111
{
	int a1=80;
}
class abc extends xyz111
{
	int a1=100;
	void display(int a1)
	{
		System.out.println("Value of a1 using this:"+this.a1);
		System.out.println("Value of a1 passed while calling:"+a1);
		System.out.println("Value of a1 od super class:"+super.a1);
	}
}

public class thisDemo {

	public static void main (String args[])
	{
		abc obj1=new abc();
		obj1.display(50);
	}
}

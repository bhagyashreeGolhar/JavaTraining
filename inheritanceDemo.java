
class parent
{
	int site=10;
	int money=100;
	String car="BMW";
}
class child extends parent
{
	int money=3000;
	void display()
	{
		System.out.println("Site"+site);
		System.out.println("Money from child class:"+money);
		System.out.println("Parent class money value"+super.money);
		System.out.println("Car:"+car);
	}
	
}


public class inheritanceDemo {
	public static void main(String args[])
	{
		child c=new child();
		c.display();
	}
}

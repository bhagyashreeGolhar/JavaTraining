class Bank
{
	int loan()
	{
		System.out.println("Bank loan");
		return 10;
	}
}

class SBI extends Bank
{
	int loan()
	{
		System.out.println("SBI loan");
		return 10;
	}
}


class Axis extends Bank
{
	int loan()
	{
		System.out.println("Axis loan");
		return 8;
	}
}



public class MethodOverriding {
	
	
	public static void main(String args[])
	{
		Axis obj=new Axis();
		System.out.println("Axis loan return:"+obj.loan());
		SBI obj1=new SBI();
		System.out.println("SBI loan return:"+obj1.loan());
	}

}

import java.util.Scanner;

class A
{
	
	Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("constructor");
	}
	void abc()
	{
		System.out.println("abc");
		System.out.println("Enter First No");
		int a= sc.nextInt();
		System.out.println("Enter Second No");
		int b= sc.nextInt();
		System.out.println("Enter Third No");
		int c= sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("First No is Greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("Second No is Greater");
		}
		else
		{
			System.out.println("Third No is Greater");
		}
	}
}
public class constructordemo {
	public static void main(String args[])
	{
		A obj=new A();
		obj.abc();
	}

}

class c
{
	static int a=10;
	static void dis()
	{
		System.out.println("This is static method of C class");
	}
}
public class StaticKeywordDemo {
	public static void main(String args[])
	{
		c.dis();                                  //static method can be accessed through name of the class 
		System.out.print("Valueof a is:"+c.a);     //static variable can be accessed through name of the class 
	}

}

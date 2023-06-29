/*we can't override final method
 * we can't extend final class
 * we can't update value of final variable
 */


class c11
{
	final int a=10;
	final void dis()
	{
		System.out.println("This is Final method of C11 class");
	}
}
class b11 extends c11
{
	/*void dis()                      			//we can't override final method
	{
		System.out.println("Overriding dis method of c11");
	}*/
}
public class FinalKeywordDemo {
	public static void main(String args[])
	{
		c11 c=new c11();
		c.dis();                                  //final method calling 
		//c.a=20;									  //final variable value can not be updated
		System.out.print("Valueof a is:"+c.a);     
	}
}

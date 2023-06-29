/*interface I1
{
	static int a=10;
	void add();
	void sub();
}
interface I2
{
	static int b=20;
	void mul();
	void div();
}
interface I3 extends I1,I2
{}
class d12 implements I3
{
	public void add()
	{
		System.out.println("Addition is"+(I1.a+I2.b));
	}
	public void sub()
	{
		System.out.println("Substraction is"+(I1.a - I2.b));
	}
	public void mul()
	{
		System.out.println("Multiplication is"+(I1.a * I2.b));
	}
	public void div()
	{
		System.out.println("Division is"+(I1.a / I2.b));
	}


}
public class interfaceDemo {
	public static void main(String[] args) {
		System.out.println("******Class d12 implementing I3**********");
		d12 obj=new d12();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		System.out.println("******Interface I1**********");
		I1 i=obj;                                           //passing reference of d12-class object to access method through interface object
		i.add();											//I1 has add and sub method
		i.sub();
		System.out.println("******Interface I2**********");
		I3 i2=obj;											//passing reference of d12-class object to access method through interface object
		i2.mul();											//I2 has div and mul method
		i2.div();
		System.out.println("******Interface I3 which is extending I! , I2**********");
		I3 i3=obj;											//passing reference of d12-class object to access method through interface object
		i3.add();											//I1 has add,sub,mul and div method
		i3.sub();
		i3.mul();
		i3.div();
	}
}*/
interface University
{
	void exam();
	void result();
}

class IITBombay implements University
{
	public void exam()
	{
		System.out.println("IIT_Bombay Exam");
	}
	public void result()
	{
		System.out.println("IIT_Bombay Result");
	}
	
}
class IITDelhi implements University
{
	public void exam()
	{
		System.out.println("IIT_Delhi Exam");
	}
	public void result()
	{
		System.out.println("IIT_Delhi Result");
	}
	
}

public class interfaceDemo {
	public static void main(String[] args) {
		IITBombay obj1=new IITBombay();
		obj1.exam();
		obj1.result();
		IITDelhi obj2=new IITDelhi();
		obj2.exam();
		obj2.result();
	
	}

}
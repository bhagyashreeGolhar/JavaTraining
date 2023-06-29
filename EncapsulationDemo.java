/*
 * Encapsulation: Wrappping up data into single unit or hide data using access specifires
 */
class x
{
	private int a;  // it is private variable we can acces it outside class through setter and getter method
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		x obj=new x();
		obj.setA(300);										//Using setter method assigning value to private var a
		System.out.println("Value of a is :"+obj.getA());   //Using getter method accessing value of private var a
		obj.setName("Bhagyashree");
		System.out.println("Name is: "+obj.getName());
		obj.setAge(22);
		System.out.println("Age is:"+obj.getAge());
	}

}

import java.util.Scanner;

class parent1
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	
	parent1()
	{
		System.out.println("This is Parent Class constructor");
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		
	}
}
class child1 extends parent1
{
	child1()
	{
		//by default parent constructor will be called as we are extending that class
		System.out.println("This is Child Class constructor");
	}
	void display()
	{
		System.out.println("child Name is"+name);  //reusing variables name and id from parent as we have extended parent class
		System.out.println("child ID is:"+id);
	}
}


class child2 extends parent1
{
	child2()
	{
		//by default parent constructor will be called as we are extending that class
		System.out.println("This is Child2 Class constructor");
	}
	void display()
	{
		System.out.println("child2 Name is"+name);  //reusing variables name and id from parent as we have extended parent class
		System.out.println("child2 ID is:"+id);
	}
}

public class superConstructor {
	public static void main(String args[])
	{
		child1 obj=new child1();  //accepting name and id from parent constructor
		obj.display(); //displaying accepted value from child display method
		child2 obj2=new child2();
		obj2.display();
	}

}

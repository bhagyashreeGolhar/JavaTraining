import java.util.Scanner;

class D
{
	
	Scanner sc=new Scanner(System.in);
	
	int id;
	String name;
	int age;
	int salary;
	
	D()
	{
		System.out.println("Enter ID");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Salary");
		salary=sc.nextInt();
	}
	 public void display()
	 {
		 System.out.println("ID is:"+id);
		 System.out.println("Name is"+name);
		 System.out.println("Age is"+age);
		 System.out.println("Salary is"+salary);
		 
	 }
	 void abc()
	 {
		 System.out.println("abc method...");
	 }
}
public class demo1 {

	public static void main(String args[])
	{
		D a1=new D();
		a1.display();
		a1.abc();
	}
	
	
}

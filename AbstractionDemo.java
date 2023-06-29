/*abstract class Abc{

    abstract void abc1();
    
}
class xyz extends Abc
{
    void abc1()
    {
        System.out.println("this is implementation od abc1 from Abc class");
    }
}
public class AbstractionDemo {
public static void main(String[] args) {
        xyz obj=new xyz();
        obj.abc1();
    }
    
}
*/


//If we make method abstract class extending to abstract class must implement abstract method of that class



import java.util.Scanner;

abstract class emp15
{
	int id;
	String name;
	int age;
	long salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	emp15()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	
	abstract void raiseSalary();
}
class clerk11 extends emp15
{
	
	void display()
	{
		salary=25000;
		designation="Clerk";
		raiseSalary();
		System.out.println("Clerk Id:"+id);
		System.out.println("Clerk name :"+name);
		System.out.println("Clerk age is :"+age);
		System.out.println("Clerk salary is :"+salary);
		System.out.println("Clerk Designation is: "+designation);
	}
	void raiseSalary()
	{
		salary=salary+10000;
	}
}

class Dev11 extends emp15
{
	
	void display()
	{
		salary=30000;
		designation="Developer";
		raiseSalary();
		System.out.println("Dev Id:"+id);
		System.out.println("Dev name :"+name);
		System.out.println("Dev age :"+age);
		System.out.println("Dev salary :"+salary);
		System.out.println("Dev Designatin:"+designation);
	}
	void raiseSalary()
	{
		salary=salary+10000;
	}
}


class Manager11 extends emp15
{
	
	
	void display()
	{
		salary=50000;
		designation="Manager";
		raiseSalary();
		System.out.println("Manager Id:"+id);
		System.out.println("Manager :"+name);
		System.out.println("Manager:"+age);
		System.out.println("Manager:"+salary);
		System.out.println("Manager :"+designation);
	}
	void raiseSalary()
	{
		salary=salary+10000;
	}
}

class Tester11 extends emp15
{
	
	void display()
	{
		salary=30000;
		designation="Tester";
		 raiseSalary();
		System.out.println("Tester Id:"+id);
		System.out.println("Tester :"+name);
		System.out.println("Tester:"+age);
		System.out.println("Tester:"+salary);
		System.out.println("Tester :"+designation);
	}
	void raiseSalary()
	{
		salary=salary+10000;
	}
	
	
}

public class AbstractionDemo {
	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
		System.out.println("1.Clerk\n2.Developer\n3.Tester\n4.Manager\n5.Exit");
		System.out.println("Enter choice");
		ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("In clerk class");
			clerk11 clerk1=new clerk11();
			clerk1.display();
		}
		else if(ch==2)
		{
			Dev11 dev=new Dev11();
			dev.display();
			
		}
		else if(ch==3)
		{
			Manager11 manager=new Manager11();
			manager.display();
		}
		else if(ch==4)
		{
			Tester11 tester=new Tester11();
			tester.display();
		}
		else if(ch==5)
		{
			System.out.println("Thank You");
		}
		}while(ch<=4);
	}
}


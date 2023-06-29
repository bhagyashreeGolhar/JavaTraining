import java.util.Scanner;

/* we are not using inheritance so no reuse of code
 * 
 * 
 class clerk
{
	int id;
	String name;
	int age;
	long salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	clerk()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Salary");
		salary=sc.nextLong();
		System.out.println("Enter Designation");
	    designation=sc.next();
	}
	void display()
	{
		System.out.println("Clerk Id:"+id);
		System.out.println("Clerk name :"+name);
		System.out.println("age is :"+age);
		System.out.println("salary is :"+salary);
		System.out.println("Designation is: "+designation);
	}
}

class Dev
{
	int id;
	String name;
	int age;
	long salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	Dev()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Salary");
		salary=sc.nextLong();
		System.out.println("Enter Designation");
	    designation=sc.next();
	}
	void display()
	{
		System.out.println("Dev Id:"+id);
		System.out.println("Dev name :"+name);
		System.out.println("Dev age :"+age);
		System.out.println("Dev salary :"+salary);
		System.out.println("Dev Designatin:"+designation);
	}
}


class Manager
{
	int id;
	String name;
	int age;
	long salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	Manager()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Salary");
		salary=sc.nextLong();
		System.out.println("Enter Designation");
	    designation=sc.next();
	}
	void display()
	{
		System.out.println("Manager Id:"+id);
		System.out.println("Manager :"+name);
		System.out.println("Manager:"+age);
		System.out.println("Manager:"+salary);
		System.out.println("Manager :"+designation);
	}
}

class Tester
{
	int id;
	String name;
	int age;
	long salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	Tester()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Salary");
		salary=sc.nextLong();
		System.out.println("Enter Designation");
	    designation=sc.next();
	}
	void display()
	{
		System.out.println("Tester Id:"+id);
		System.out.println("Tester :"+name);
		System.out.println("Tester:"+age);
		System.out.println("Tester:"+salary);
		System.out.println("Tester :"+designation);
	}
	
	
}

public class singleInheritance {
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
			clerk clerk1=new clerk();
			clerk1.display();
		}
		else if(ch==2)
		{
			Dev dev=new Dev();
			dev.display();
			
		}
		else if(ch==3)
		{
			Manager manager=new Manager();
			manager.display();
		}
		else if(ch==4)
		{
			Tester tester=new Tester();
			tester.display();
		}
		else if(ch==5)
		{
			System.out.println("Thank You");
		}
		}while(ch<=4);
	}
}*/










//with the help of Inheritance reuse code which is repeated in each class
class emp11
{
	int id;
	String name;
	int age;
	long salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	emp11()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
}
class clerk extends emp11
{
	
	void display()
	{
		salary=25000;
		designation="Clerk";
		System.out.println("Clerk Id:"+id);
		System.out.println("Clerk name :"+name);
		System.out.println("Clerk age is :"+age);
		System.out.println("Clerk salary is :"+salary);
		System.out.println("Clerk Designation is: "+designation);
	}
}

class Dev extends emp11
{
	
	void display()
	{
		salary=30000;
		designation="Developer";
		System.out.println("Dev Id:"+id);
		System.out.println("Dev name :"+name);
		System.out.println("Dev age :"+age);
		System.out.println("Dev salary :"+salary);
		System.out.println("Dev Designatin:"+designation);
	}
}


class Manager extends emp11
{
	
	
	void display()
	{
		salary=50000;
		designation="Manager";
		System.out.println("Manager Id:"+id);
		System.out.println("Manager :"+name);
		System.out.println("Manager:"+age);
		System.out.println("Manager:"+salary);
		System.out.println("Manager :"+designation);
	}
}

class Tester extends emp11
{
	
	void display()
	{
		salary=30000;
		designation="Tester";
		System.out.println("Tester Id:"+id);
		System.out.println("Tester :"+name);
		System.out.println("Tester:"+age);
		System.out.println("Tester:"+salary);
		System.out.println("Tester :"+designation);
	}
	
	
}

public class singleInheritance {
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
			clerk clerk1=new clerk();
			clerk1.display();
		}
		else if(ch==2)
		{
			Dev dev=new Dev();
			dev.display();
			
		}
		else if(ch==3)
		{
			Manager manager=new Manager();
			manager.display();
		}
		else if(ch==4)
		{
			Tester tester=new Tester();
			tester.display();
		}
		else if(ch==5)
		{
			System.out.println("Thank You");
		}
		}while(ch<=4);
	}
}




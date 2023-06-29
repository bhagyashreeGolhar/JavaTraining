class overloading
{
	overloading()
	{
		System.out.println("No argument constructor");
	}
	overloading(int a)
	{
		System.out.println("one argument constructor  1:int argument value:"+a);
	}
	overloading(int a,String s)
	{
		System.out.println("two argument constructor 1:int argument value:"+a +" and 2:String argument value:"+s);
	}
	
}

class Draw
{
    Draw()
    {
    	this(10); //will execute constructor with one arg
        System.out.println(" Draw()");
    }
    Draw(int a )
    {
    	this(10,20); //will execute constructore with two arg
        System.out.println(" Draw() area of  square "+ (a * a ));
    }
 

    Draw(int l, int b)
    {
        System.out.println(" Draw() area of Rectanlge "+ (l*b));
    }
}

class Emp1
{
    Emp1(int id, String name , int age , int salary , String desig, String pan)
    {
        System.out.println(" yes perferct  HR ");
    }
    Emp1(int id, String name , String project, String loc)
    {
        System.out.println(" yes perferct  manager ");    
    }

}
public class Constructor_Overloading {
	
	public static void main(String args[])
	{
		overloading obj=new overloading();
		overloading obj1=new overloading(11);
		overloading obj2=new overloading(15,"sakshi");
		
		
		Draw d1=new Draw();
		//Draw d2=new Draw(10);
		//Draw d3=new Draw(10,20);
		
		Emp1 e = new Emp1(100,"Rama",35,45678,"Dev","ABC123");
        Emp1 e2 = new Emp1(100,"Rama","Facebok","Banglore");
		
		
	}

}

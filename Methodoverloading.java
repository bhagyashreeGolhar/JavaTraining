class Z
{
    void Draw()
    {
    	this.Draw(10); //will execute constructor with one arg
        System.out.println(" Draw()");
    }
   void  Draw(int a )
    {
    	this.Draw(10,20); //will execute constructore with two arg
        System.out.println(" Draw() area of  square "+ (a * a ));
    }
 

   void  Draw(int l, int b)
    {
        System.out.println(" Draw() area of Rectanlge "+ (l*b));
    }
}

public class Methodoverloading {
	public static void main(String args[])
	{
		Z obj=new Z();
		obj.Draw();
		
	}
}

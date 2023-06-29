package com;

public class accessSpecifireDemo {
	private int a1=100;
	public int a2=200;
	protected int a3=300;  // accessible in subclass and same packge
	int a4=400;  //accesible in same package
	
}
 class A11 extends accessSpecifireDemo
{
	void display()
	{
		//System.out.println(a1); //private is not accessible
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
class B1
{
	A11 obj=new A11();
	void display()
	{
		//System.out.println(obj.a1); //private is not accessible
		System.out.println(obj.a2);
		System.out.println(obj.a3);
		System.out.println(obj.a4);
	}
}
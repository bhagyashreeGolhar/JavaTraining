package com;

public class StringMethods {
	public static void main(String[] args) {
		String name="  Bhagyashree Mohan Golhar  ";
		System.out.println(name);
		
		String s=new String("Sakshi");
		
		System.out.println("ToUppaercase: "+ s.toUpperCase());
		System.out.println("To Lower Case: "+ s.toLowerCase());
		System.out.println("Length of s: "+s.length());
		System.out.println("Replace Golahe with Wani: "+name.replace("Golhar","Wani"));
		System.out.println("name Startswith 'B': "+name.startsWith("B"));
		System.out.println("Name endsWith 'r': "+name.endsWith("r"));
		System.out.println("Concat Name and s: "+name.concat(s));
		System.out.println("Name Equals S: "+name.equals(s));
		System.out.println("s equald uppercase s: "+s.equalsIgnoreCase("SAKSHI"));
		System.out.println("Character at 0th index: "+s.charAt(0));
	}

}

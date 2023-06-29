package com;

public class StringCreationMethods {
	public static void main(String[] args) {
		
		String s=new String("Sakshi");  //String is immutable we can't modify
		System.out.println(s);
		
		s.concat(" Golhar");
		System.out.println(s);
		
		s=s.concat("Wani");
		System.out.println("After assigning  concatinated with other string: "+s);
		
		
		//Stringbulder and Sttingbuffer is mutable we can change value of string original value is changes after updation
		
		
		//stringBuffer is Thread safe
		StringBuffer sb=new StringBuffer("Bhagyashree");
		sb.append("Golhar");
		System.out.println("After appending Golhar ti stringBuffer: "+sb);
		
		
		//StringBuffer is not thread safe
		StringBuilder sbuil=new StringBuilder("Sagar");
		sbuil.append("Golhar");
		System.out.println("After Apending to stringbuilder: "+sbuil);
		
		
		
	}

}

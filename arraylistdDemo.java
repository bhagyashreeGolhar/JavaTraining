package com;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdDemo {

	public static void main(String[] args) {
		
		//Heteroginus elements and size is not fixed
		//ArrayLost is good for searching Operation
		ArrayList ar =new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(10.50);
		ar.add("abc");
		ar.add('c');
		ar.add(true);
		//ar.add(new Date());
		
		System.out.println(ar);
		
		System.out.println("____________________________________________");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("____________________________________________");
		Iterator i=ar.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("___________________Method of Arraylist____________________");
		System.out.println("Contains Method: arralylist containd 100->"+ar.contains(100));
		System.out.println("Remove Method: removing->"+ar.remove(0));
		System.out.println("Is Empty MEthod: "+ar.isEmpty());
		System.out.println("Size method:  size of arraylist->"+ ar.size());
		//System.out.println("Clear method :" +ar.clear());
		System.out.println("Whole list after remove:"+ar);
		
	}
}

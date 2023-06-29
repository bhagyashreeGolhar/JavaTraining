package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedListCollection {
	
	public static void main(String[] args) {
		
	//Linkedlist  is best for insert and delete operation 
	
	LinkedList ll =new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(10.50);
		ll.add("abc");
		ll.add('c');
		ll.add(true);
		ll.add(4,"Sakshi");
		
		//ar.add(new Date());
	
	System.out.println(ll);
	
	System.out.println("____________________________________________");
	
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println("____________________________________________");
	Iterator i=ll.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	System.out.println("___________________Method of Linkedlist____________________");
	System.out.println("Contains Method: LinkedList contains 100->"+ll.contains(100));
	System.out.println("Remove Method: removing->"+ll.remove(0));
	System.out.println("Is Empty MEthod: "+ll.isEmpty());
	System.out.println("Size method:  size of arraylist->"+ ll.size());
	//System.out.println("Clear method :" +ar.clear());
	System.out.println("Whole list after remove:"+ll);
	
}
	

}

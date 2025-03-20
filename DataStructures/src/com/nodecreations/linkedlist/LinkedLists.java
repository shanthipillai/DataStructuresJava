package com.nodecreations.linkedlist;


public class LinkedLists {
public static void main(String[] args) {
	LinkedList lobj=new LinkedList(20);
	System.out.println("Length==============="+lobj.getLength());
	lobj.append(30);
	lobj.prepend(50);
	System.out.println("Length================"+lobj.getLength());
	
	lobj.insert(60, 2);
	System.out.println("Length================"+lobj.getLength());
	lobj.insert(65, 5);
	lobj.insert(77, 1);
	lobj.append(89);
	System.out.println("Length================"+lobj.getLength());
	System.out.println("+++++++++++++++++");
	lobj.printn();
	System.out.println(lobj.getLength());
	lobj.remove(3);
	System.out.println("Length================"+lobj.getLength());
	System.out.println("+++++++++++++++++");
	lobj.printn();
	lobj.printReverse();
	lobj.printn();
	
	lobj.removeLast();
	System.out.println("Length================"+lobj.getLength());
	System.out.println("+++++++++++++++++");
	lobj.printn();
	
	
	System.out.println("Remove First");
	lobj.removeFirst();
	System.out.println("+++++++++++++++++");
	lobj.printn();

	lobj.append(35);
	System.out.println("Append PRint+++++++++++++++++");
	lobj.printn();
	
  //  lobj.removeDuplicates();
    System.out.println(lobj.getLength());
	
}
}

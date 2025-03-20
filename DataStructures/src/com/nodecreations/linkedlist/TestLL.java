package com.nodecreations.linkedlist;

public class TestLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lobj=new LinkedList(30);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		
		
		lobj.append(40);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		lobj.prepend(20);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		
		lobj.insert(25, 2);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		lobj.insert(10, 1);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		lobj.insert(50, lobj.getLength()+1);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		
		lobj.remove(3);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		
		lobj.removeFirst();
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		
		lobj.removeLast();
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		
		lobj.append(50);
		System.out.println("Length==============="+lobj.getLength());
		System.out.println("+++++++++++++++++");
		lobj.printn();
		
		lobj.removeDuplicates();
	}

}

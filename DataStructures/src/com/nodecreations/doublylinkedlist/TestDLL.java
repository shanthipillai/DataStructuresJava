package com.nodecreations.doublylinkedlist;

public class TestDLL {

	public static void main(String[] args) {
		DoublyLL dl=new DoublyLL(10);
		
		
		dl.append(20);
		dl.append(30);
		dl.print();
		
		dl.printRev();
		
		System.out.println();
		
		dl.prepend(100);
		dl.print();
		
		dl.insert(44,2);
		dl.print();
		System.out.println();
		dl.insert(444,1);
		dl.print();
		System.out.println("length"+dl.getLength());
		dl.insert(445,7);
		dl.print();
		
		System.out.println();
		dl.remove(2);
		dl.print();
		
		
		
		System.out.println();
		dl.removeFirst();
		dl.print();
		
		System.out.println();
		dl.removeLast();
		dl.print();
		
		
	} 

}

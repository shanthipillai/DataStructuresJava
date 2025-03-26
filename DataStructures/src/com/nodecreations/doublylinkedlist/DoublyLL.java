package com.nodecreations.doublylinkedlist;



public class DoublyLL {

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	Node head;
	Node tail;
	int length;

	public DoublyLL(int value) {
		Node node = new Node(value);
		// this.value=value;
		head = node;
		tail = node;
		length = 1;

	}

	public void append(int value) {

		Node node = new Node(value);
		tail.next = node;
		node.prev = tail;

		tail = node;
		length++;
	}

	
	public void prepend(int value)
	{
		
		Node node = new Node(value);
		node.next=head;
		head.prev=node;
		head=node;
		
		length++;
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	} 
	
	public void printRev()
	{
	     Node temp=tail;
	     while(temp!=null)
	     {
	    	 System.out.println(temp.value);
				temp=temp.prev;
	     }
	}
	
	
	public Node getIndex(int index)
	{
		Node temp=head;
		
		for(int i=1;i<index;i++)
		{
			temp=temp.next; //50,20,
		}
		
		return temp;
	}
	
	public void  remove(int pos)
	{
		Node afterpos=getIndex(pos+1);
		
		Node beforepos=getIndex(pos-1);
		beforepos.next=afterpos;
		afterpos.prev=beforepos;
		length--;
	}
	
	
	public void removeFirst()
	{
		head=head.next;
	}
	
	
	public void removeLast()
	{
		tail=tail.prev;
		tail.next=null;
	}

	public void insert(int val, int pos)
	{
		
		if(pos==1)
		{
			prepend(val);
		}
		
		else
			if(pos>getLength())
			{
				append(val);
			}
		
			else
			{
		Node node = new Node(val);
		Node actualposit=getIndex(pos);
		Node beforepos=getIndex(pos-1);
		beforepos.next=node;
		node.prev=beforepos;
		node.next=actualposit;
		actualposit.prev=node;
		length++;
			}
	}
	class Node {
		int value;
		Node prev;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
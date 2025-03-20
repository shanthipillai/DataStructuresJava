package com.nodecreations.queue;

public class Queue {
	
	Node first;
	Node last;
	int height;

	
	class Node
	{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public Queue(int value)
	{
		Node node=new Node(value);
		first=node;
		last=node;
		height=1;
	}
	
	public void enqueue(int value)
	{
		Node node=new Node(value);
		last.next=node;
		last=node;
		
	}
	
	
	public void dequeue()
	{
		first=first.next;
	}
	public void printQueue()
	{
		Node temp=first;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
}

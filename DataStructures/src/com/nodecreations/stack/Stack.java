package com.nodecreations.stack;

public class Stack {
	Node top;
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

Stack(int value)
{
	Node node=new Node(value);
	top=node;
	height=1;
}



public void print()
{
	Node temp=top;
	while(temp!=null)
	{
		System.out.println(temp.value);
		temp=temp.next;
	}
}

public void push(int value)
{
	Node node=new Node(value);
	node.next=top;
	top=node;
	height++;
	
}

public void pop()
{
	//Node temp=top;
	top=top.next;
	height--;
}

}
package com.nodecreations.linkedlist;

public class LinkedList {
	private Node head;

	private Node tail;
	private int length;
	
	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public Node getTail() {
		return tail;
	}


	public void setTail(Node tail) {
		this.tail = tail;
	}


	public int getLength() {
		
		//System.out.println(this.length);
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}

	
	
	class Node
	{
		int value;
		Node next;
		public Node(int value) {
		this.value=value;
		}
		
	}

public LinkedList(int value)
{
	Node newNode=new Node(value);
	head=newNode;
	tail=newNode;
	length=1;
}


public void append(int value)
{
	System.out.println("Debug2");
	Node append=new Node(value);
	tail.next=append;
	tail=append;
	length++;
}

public void prepend(int value)
{

	Node prepend=new Node(value);
	prepend.next=head;
	head=prepend;
	length++;
}

public void insert(int value, int position)
{
	if(position==1)
	{
		System.out.println("REached");
		prepend(value);
	}
	else
	if(position>getLength())
	{
		System.out.println("Debug1");
		append(value);
	}
	else
	{
	Node insert=new Node(value);
	Node afterNode=getIndex(position);
	
	Node beforeNode=getIndex(position-1);
	System.out.println("AfterVal"+afterNode.value);
	beforeNode.next=insert;
	insert.next=afterNode;
	length++;
	}
	
	
}


public void remove(int position)
{
	Node prevNode=getIndex(position-1);
	System.out.println("PrevNode"+prevNode.value);
	Node afterNode=getIndex(position+1);
	System.out.println("AfterNod"+afterNode.value);
	prevNode.next=afterNode;
	length--;
	
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

public void printn()
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.value);
		temp=temp.next;
	}
	
}


public void printReverse()
{
	Node temp=head;
	head=tail;
	tail=temp;
	
	Node before=null;
	Node after=temp.next;
	int len=getLength();
	System.out.println("Here is the length you have");
	for(int i=0;i<len;i++)
	{
		after=temp.next;
		temp.next=before;
		before=temp;
		temp=after;
	}
	
	
}

public void removeLast()
{
	int len=getLength();
	Node prevNode=getIndex(len-1);
	prevNode.next=null;
	tail=prevNode;
	length--;
}

public void removeFirst()
{
	head=head.next;
	length--;
}

public void removeDuplicates()
{

	System.out.println("Length"+getLength());
	Node temp1=head;
	Node temp2=head;
	
	
	for(int i=1;i<getLength();i++)
	{
		if(temp1!=null)
		{
			for(int j=i+1;j<getLength();j++)
			{
				if(temp2!=null)
				{
					if(temp1.value==temp2.value)
					{
						
						System.out.println(temp1.value+"="+temp2.value);
					}
				}
			}
		}
	}
	
	
}
}

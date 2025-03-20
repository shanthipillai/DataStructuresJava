package com.nodecreations.queue;

public class TestQueue {
public static void main(String[] args) {
	Queue queue=new Queue(10);
	
	queue.enqueue(20);
	queue.enqueue(30);
	queue.printQueue();
	queue.dequeue();
	System.out.println();
	queue.printQueue();
}
}

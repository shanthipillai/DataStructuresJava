package com.nodecreations.stack;

public class StackTest {
public static void main(String[] args) {
	Stack stack=new Stack(10);
	//stack.print();
	System.out.println(stack.height);
	stack.push(20);
	stack.push(30);
	stack.print();
	System.out.println(stack.height);
	stack.pop();
	stack.print();
	System.out.println(stack.height);
	
	
}
}

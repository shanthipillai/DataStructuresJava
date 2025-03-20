package com.nodecreations.trees;

public class TestBinarySearch {
public static void main(String[] args) {
	BinaryTree bt=new BinaryTree();
	bt.insert(47);;
	bt.insert(21);
	bt.insert(76);
	bt.insert(18);
	bt.insert(52);
	bt.insert(82);
	bt.insert(27);
	System.out.println(bt.root.left.right.value);
	
	System.out.println(bt.contains(27));
}
}

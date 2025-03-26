package com.nodecreations.trees;

public class TestBinarySearch {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();

		/*
		 * bt.insert(47);; bt.insert(21); bt.insert(76); bt.insert(18); bt.insert(52);
		 * bt.insert(82); bt.insert(27);
		 */

		bt.rInsert(47);
		bt.rInsert(21);
		bt.rInsert(76);
		bt.rInsert(18);
		bt.rInsert(52);
		bt.rInsert(82);
		bt.rInsert(27);
		System.out.println(bt.root.value);
		
		System.out.println(bt.root.left.value);
		System.out.println(bt.root.left.left.value);
		System.out.println(bt.root.left.right.value);
		System.out.println(bt.root.right.right.value);
		System.out.println(bt.root.right.left.value);

		/*
		 * System.out.println("Binary Search Tree- BFT");
		 * bt.BFS().stream().forEach(System.out::println);
		 */

		// System.out.println(bt.contains(27));

		// System.out.println(bt.containsRecusiveCall(27));
		
		
		//bt.BFS().stream().forEach(System.out::println);
		
		System.out.println("Depth First Search Pre-Order");
		
		System.out.println(bt.DSPreOrder());
		System.out.println("Depth First Search Post-Order");
		System.out.println(bt.DSPostOrder());
		System.out.println("Depth First Search In-Order");
		System.out.println(bt.DSInOrder());
	}
}

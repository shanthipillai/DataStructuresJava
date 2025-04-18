package com.nodecreations.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {
	Node root;

	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

		public boolean insert(int value) {
			Node newNode = new Node(value);

			if (root == null) {
				root = newNode;
				return true;

			}
			Node temp = root;
			while (true)

			{
				  if(temp.value==newNode.value)
				  {
					  return false;
				  }
				  
				  if(newNode.value<temp.value)
				  {
					  if(temp.left==null)
					  {
						  temp.left=newNode;
						  return true;
					  }
					  temp=temp.left;
				  }
				  else
				  {
					  if(newNode.value>temp.value)
					  {
						  if(temp.right==null)
						  {
							  temp.right=newNode;
							  return true;
						  }
						  temp=temp.right;
					  }
				  }
			}
		}
		
		
		public boolean contains(int value)
		{
			if(root==null)
			{
				return false;
			}
			Node temp=root;
			while(temp!=null)
			{
				if(value<temp.value)
				{
					temp=temp.left;
				}
				else
					if(value>temp.value)
					{
						temp=temp.right;
					}
					else
					{
						return true;
					}
				
			}
			return false;
		}
		
		
		public boolean containsRecusiveCall(int value)
		{
			return conatainsR(root, value);
		}


		private boolean conatainsR(Node currentNode, int value) {
		
			
			if(currentNode==null)  return false;
			
			
			if(currentNode.value==value)
			
				return true;
			
			
		
				if(value<currentNode.value)
				
					return conatainsR(currentNode.left,value);
				
				else
				
					return conatainsR(currentNode.right,value);
				
			
		}
		
		
		
		
		private Node rInsert(Node currentNode, int value)
		{
			if(currentNode==null)  return new Node(value);
			
			
			if(value<currentNode.value)
			{
				
				currentNode.left=rInsert(currentNode.left, value);
			}
			
			
			else
				if(value>currentNode.value)
				{
				
					currentNode.right=rInsert(currentNode.right, value);
				}
			return currentNode;
			
			
		}
		
		public void rInsert(int value)
		{
			if(root==null)
				root=new Node(value);
			//47,21
			rInsert(root,value);
		}
		
		public ArrayList<Integer> BFS()
		{
			Node currentNode=root;
			Queue<Node> queue=new LinkedList<>();
			ArrayList<Integer> results=new ArrayList<>();
			queue.add(currentNode);
			while(queue.size()>0)
			{
				currentNode=queue.remove();
				results.add(currentNode.value);
			
				
				if(currentNode.left!=null)
				{
					queue.add(currentNode.left);
					
				}
				
				if(currentNode.right!=null)
				{
					queue.add(currentNode.right);
					
				}
			}
			return results;
		}
		
		
		public ArrayList<Integer>  DSPreOrder()
		{
			ArrayList<Integer> results=new ArrayList<>();
			class Traverse
			{
				Traverse(Node currentNode)
				{
					results.add(currentNode.value); //47
					
					if(currentNode.left!=null) //21
					{
						new Traverse(currentNode.left);
					}
					
					if(currentNode.right!=null) //76
					{
						new Traverse(currentNode.right);
					}
				}
			}
			new Traverse(root);
			return results;
		}
		
		public ArrayList<Integer>  DSPostOrder()
		{
			ArrayList<Integer> results=new ArrayList<>();
			class Traverse
			{
				Traverse(Node currentNode)
				{
				
					
					if(currentNode.left!=null)
					{
						new Traverse(currentNode.left);
					}
					
					if(currentNode.right!=null)
					{
						new Traverse(currentNode.right);
					}
					results.add(currentNode.value);
				}
			}
			new Traverse(root);
			return results;
			
		}
		
		
		public ArrayList<Integer>  DSInOrder()
		{
			ArrayList<Integer> results=new ArrayList<>();
			class Traverse
			{
				Traverse(Node currentNode)
				{
				
					
					if(currentNode.left!=null)
					{
						new Traverse(currentNode.left);
					}
					results.add(currentNode.value);
					if(currentNode.right!=null)
					{
						new Traverse(currentNode.right);
					}
					
				}
			}
			new Traverse(root);
			return results;
		}
	}


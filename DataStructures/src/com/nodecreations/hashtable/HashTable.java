package com.nodecreations.hashtable;

import java.util.ArrayList;
import java.util.Random;

public class HashTable {
	private int size = 7;
	private Node[] dataMap;

	public HashTable() {
		dataMap = new Node[size];
	}

	class Node {
		String key;
		int value;
		Node next;

		Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	// HASH METHOD MUST BE PUBLIC FOR CODE IN MAIN TO WORK
    public int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }
    
    
    
    
    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
    
    
    
    
    
    public void set(String key, int value)
    {
    	int index=hash(key);
    	Node newNode=new Node(key,value);
    	if(dataMap[index]==null)
    	{
    		dataMap[index]=newNode;
    	}
    	
    	else
    	{
    		Node temp=dataMap[index];
    		while(temp.next!=null)
    		{
    			temp=temp.next;
    		}
    		
    		temp.next=newNode;
    	}
    }
    
    
    public int get(String key)
    {
    	int index=hash(key);
    	Node temp=dataMap[index];
    	while(temp!=null)
    	{
    		if(temp.key==key)
    		{
    			return temp.value;
    		}
    	}
    	return 0;
    	
    }
    
    
    public ArrayList<String> printKeys()
    {
    	
    	ArrayList<String> keys=new ArrayList<>();
    	for(int i=0;i<dataMap.length;i++)
    	{
    		Node temp=dataMap[i];
    		while(temp!=null)
    		{
    			keys.add(temp.key);
    			temp=temp.next;
    		}
    }
    	return keys;
    
    }
    
    
    public ArrayList<Integer> printValues()
    {
    	
    	ArrayList<Integer> values=new ArrayList<>();
    	for(int i=0;i<dataMap.length;i++)
    	{
    		Node temp=dataMap[i];
    		while(temp!=null)
    		{
    			values.add(temp.value);
    			temp=temp.next;
    		}
    }
    	return values;
    
    }
    
}


package com.nodecreations.hashtable;

public class TestHashTable {

	public static void main(String[] args) {
	HashTable hashTable=new HashTable();
	//hashTable.printHashTable();
	//System.out.println();
	//System.out.println(hashTable.hash("inception"));
	hashTable.set("nails", 100);
	hashTable.set("title", 50);
	hashTable.set("lumber",80);
	hashTable.set("screws", 140);
	hashTable.printTable();
	
	System.out.println(hashTable.get("nails"));
	System.out.println();
	hashTable.printKeys().stream().forEach(System.out::println);
	System.out.println();
	hashTable.printValues().stream().forEach(System.out::println);
	
	}

}

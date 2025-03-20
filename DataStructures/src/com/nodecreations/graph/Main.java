package com.nodecreations.graph;

public class Main {

	public static void main(String[] args) {
	GraphDS graphDs=new GraphDS();
	graphDs.addVertex("A");
	graphDs.addVertex("B");
	graphDs.addVertex("C");
	graphDs.addVertex("D");
	graphDs.addEdge("A", "B");
	graphDs.addEdge("A", "C");
	graphDs.addEdge("A", "D");
	//graphDs.addEdge("B", "A");
	graphDs.addEdge("B", "D");
	//graphDs.removeEdge("C", "A");
	graphDs.addEdge("C", "D");
	graphDs.removeVertex("D");
	
	//graphDs.addEdge("D", "B");
	//graphDs.addEdge("D", "C");
	//graphDs.addEdge("D", "A");
	graphDs.printGraph();
	
	}

}

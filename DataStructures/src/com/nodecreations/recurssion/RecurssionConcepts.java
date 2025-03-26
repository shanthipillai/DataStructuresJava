package com.nodecreations.recurssion;

public class RecurssionConcepts {

	static int facttorial(int n) {

		if (n== 1)
			return 1;
		return n * facttorial(n - 1);
	}

	public static void main(String[] args) {

	System.out.println(facttorial(4));
	
	}
}

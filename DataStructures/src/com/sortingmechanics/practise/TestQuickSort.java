package com.sortingmechanics.practise;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] myArray= {4,6,1,7,3,2,5};
		QuickSort.quickSort(myArray, 0, 6);
		System.out.println(Arrays.toString(myArray));

	}

	

}

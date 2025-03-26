package com.sortingmechanics.practise;

import java.util.Arrays;

public class BasicSorting {

	public static void main(String[] args) {
		int unsortedArray[]= {34,22,78,45,88,11};
		int unsortedArray1[]= {34,22,78,45,88,11};
		int unsortedArray2[]= {34,22,78,45,88,11};
		Sorting sort=new Sorting();
		int sortedBubbleArray[]=sort.bubbleSort(unsortedArray);
		System.out.println(Arrays.toString(sortedBubbleArray));
		
		System.out.println();
		
		int sortedSelectionArray[]=sort.selectionSort(unsortedArray);
		System.out.println(Arrays.toString(sortedSelectionArray));
		
		
		
		
		int insertionSort[]=sort.insertionSort(unsortedArray);
		System.out.println(Arrays.toString(insertionSort));
	}

}

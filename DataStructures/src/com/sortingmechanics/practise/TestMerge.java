package com.sortingmechanics.practise;

import java.util.Arrays;

public class TestMerge {

	public static void main(String[] args) {
	MergeSort sort=new MergeSort();
	int arr[]= {3,1,4,2};
	int mergesort[]=sort.sort(arr);
	System.out.println(Arrays.toString(mergesort));

	}

}

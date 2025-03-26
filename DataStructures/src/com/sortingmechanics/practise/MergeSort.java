package com.sortingmechanics.practise;

import java.util.Arrays;

public class MergeSort {

	
	
	public static int[] sort(int arr[])
	{
		if(arr.length==1) return arr;
		int mid=arr.length/2;
		int left[]= sort(Arrays.copyOfRange(arr, 0,mid));
		int right[]=sort(Arrays.copyOfRange(arr,mid, arr.length));
		return merge(left, right);
	}
	
	
	public static int[] merge(int[] array1, int[] array2)
	{
		int combined[]=new int[array1.length+array2.length];
		
		int index=0;
		int i=0;
		int j=0;
		
		while(i<array1.length  && j<array2.length)
		{
			if(array1[i]<array2[j])
			{
				combined[index]=array1[i];
				index++;
				i++;
			}
			
			
			if(array1[i]>array2[j])
			{
				combined[index]=array2[j];
				index++;
				j++;
			}
			
			
			
			
			while(i<array1.length)
			{
				
				combined[index]=array1[i];
				index++;
				i++;
			}
			
			
			while(j<array1.length)
			{
				combined[index]=array2[j];
				index++;
				j++;
			}
		}
		
		
		return combined;
		
	}
}

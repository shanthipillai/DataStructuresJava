package com.sortingmechanics.practise;

public class QuickSort {

	public static void swap(int arr[], int firstIndex, int lastIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
	}

	public  static int pivot(int[] array, int pivotIndex, int endIndex) {
		
		int swapIndex=pivotIndex;
        for(int i=pivotIndex+1;i<=endIndex;i++)
        {
        	if(array[i]<array[pivotIndex])
        	{
        		swapIndex++;
        		swap(array, swapIndex,i);
        	}
        }
        swap(array, pivotIndex,swapIndex);
		return swapIndex;
		
	}
	
	public static void quickSort(int[] array, int left, int right)
	{
		if(left<right)
		{
		int pivotIndex=pivot(array, left, right);
		quickSort(array, left, pivotIndex-1);
		quickSort(array, pivotIndex+1, right);
	}}
}

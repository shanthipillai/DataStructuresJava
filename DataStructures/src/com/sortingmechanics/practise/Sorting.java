package com.sortingmechanics.practise;

public class Sorting {

	public int[] bubbleSort(int unsortedArray[])
	{
		
		//O(n2)  6,5,4,3,2,1
		for(int i=unsortedArray.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(unsortedArray[j]>unsortedArray[j+1])
				{
					int temp=unsortedArray[j];
					unsortedArray[j]=unsortedArray[j+1];
					unsortedArray[j+1]=temp;
				}
			}
		}
		return unsortedArray;
		
	}
	
	
	
	public int[] selectionSort(int unsortedArray1[])
	{
		for(int i=0;i<unsortedArray1.length;i++)
		{
			int minindex=i;
			
			for(int j=i+1;j<unsortedArray1.length;j++)
			{
				if(unsortedArray1[j]<unsortedArray1[minindex])
				{
					minindex=j;
				}
			}
			
			int temp=unsortedArray1[i];
			unsortedArray1[i]=unsortedArray1[minindex];
			unsortedArray1[minindex]=temp;
		}
		return unsortedArray1;
		
	}
	
	
	
	public int[] insertionSort(int insertionSort[])
	{
		
		for(int i=1;i<insertionSort.length;i++)
		{
			int temp=insertionSort[i];
			
			int j=i-1;
			while(j>-1 && insertionSort[j]>temp )
			{
				insertionSort[j+1]=insertionSort[j];
				insertionSort[j]=temp;
				j--;
			}
		}
		return insertionSort;
		
	}
}

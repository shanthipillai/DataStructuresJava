package com.sortingmechanics.practise;

public class Sort {

	public static int[] sortArray(int unsortedArray[])
	{
		
		for(int i=0;i<unsortedArray.length;i++)
		{
			for(int j=i+1;j<unsortedArray.length;j++)
			{
				if(unsortedArray[i]>unsortedArray[j])
				{
					int temp=unsortedArray[j];
					unsortedArray[j]=unsortedArray[i];
					unsortedArray[i]=temp;
				  
				}
			}
		}
		
		return unsortedArray;
		
	}
	
	
	public static void main(String[] args) {

		int sortArr[]= {11,44,77,22,99,10};
		int sortedArr[]=sortArray(sortArr);
		for(int i=0;i<sortArr.length;i++)
		{
			System.out.println(sortArr[i]);
		}

	}

}

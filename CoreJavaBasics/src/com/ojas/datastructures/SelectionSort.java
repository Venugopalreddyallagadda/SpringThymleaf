package com.ojas.datastructures;

public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		int min_index = 0;
		for(int i= 0; i<arr.length;i++) {
			min_index = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min_index]>arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5,2,9};
		int res[] = selectionSort(arr);
		
		for(int i = 0; i<res.length; i++) {
			System.out.println(res[i]+ " ");
		}
		System.out.println();

	}

}

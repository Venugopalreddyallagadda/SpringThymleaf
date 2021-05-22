package com.ojas.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort1 {
	
	 public static String selectionSort(int num[]) {
		 int min_index ;
		 for(int i = 0;i<num.length;i++) {
			 min_index =i;
			 for(int j= i+1;j<num.length;j++) {
				 if(num[min_index]>num[j]) {
					  min_index = j;
				 }
			 }
			 int temp = num[i];
			 num[i] = num[min_index];
				num[min_index] = temp; 
		 }
		 
		return Arrays.toString(num);
		 
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array!");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("Sorting order:"+selectionSort(num));

	}

}

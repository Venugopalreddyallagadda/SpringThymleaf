package com.ojas.basic.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValueInArray {
	static int smallestValueInArray(int num[]) {
		String res = "";
		int small = num[0];
		for(int i = 1; i<num.length; i++) {
		if(num[i]<num[0]) {
			small = num[i];
		}
			
	}
		return small;
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
		System.out.println("Smallest Value In Array is:"+smallestValueInArray(num));
		
		
		
	}
	

}

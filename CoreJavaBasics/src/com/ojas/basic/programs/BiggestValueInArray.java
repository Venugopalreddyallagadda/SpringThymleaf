package com.ojas.basic.programs;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestValueInArray {
	static int biggestValueInArray(int num[]) {
		int big = num[0];
		for(int i = 0; i<num.length; i++) {
			if(num[i]>num[0]) {
				big = num[i];
			}
		}
		return big;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int num[] = new int[size];
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Biggest Value in Array is:"+biggestValueInArray(num));

	}

}

package com.ojas.basic.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	static String sortingElements(int num[]) {
		int temp;
		for(int i = 0; i<num.length;i++) {
			for(int j = i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
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
		System.out.println("Sorting elements:"+sortingElements(num));
	}

}

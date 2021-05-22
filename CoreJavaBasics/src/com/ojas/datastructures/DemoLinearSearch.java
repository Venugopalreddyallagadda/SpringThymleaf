package com.ojas.datastructures;

import java.util.Scanner;

public class DemoLinearSearch {

	public static void main(String[] args) {
		int arr[] = {10,3,4,5,6};
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Item");
		int item = sc.nextInt();
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==item) {
				pos = i+1;
				break;
			}
			else {
				pos = 0;
			}
		
			if(pos!=0) {
				System.out.println("Item found at location" +pos);
			}
			else {
				System.out.println("Item not found");
			}
		}

	}

}

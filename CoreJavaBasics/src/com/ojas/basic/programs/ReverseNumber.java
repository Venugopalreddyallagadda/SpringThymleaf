package com.ojas.basic.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int n;
		int sum =0;
		while(num>0) {
			n = num%10;
			sum = (sum*10)+n;
			num = num/10;
		}
		System.out.println("Reverse Number"+sum);

	}

}

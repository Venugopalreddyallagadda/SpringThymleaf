package com.ojas.basic.programs;

import java.util.Scanner;

public class PalindromeRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("sum of palindrome numbers within given range is" + sum(n1, n2));
	}

	public static int sum(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			int rev = 0, n3 = i;
			while (n3 != 0) {
				rev = (rev * 10) + (n3 % 10);
				n3 = n3 / 10;
			}
			
			if (rev == i)
				sum = sum + i;
		}
		return  sum;

	}

}

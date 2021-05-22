package com.ojas.basic.programs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int n,temp;
		int sum = 0;
		int fact = 1;
		temp = num;
		while(num>0) {
			n = num%10;
			for(int i = n; i>=1;i--) {
				fact = fact*i;
			}
			sum = sum+fact;
			num = num/10;
		}
		num = temp;
		if(num == sum) {
			System.out.println("Given num is Strong number");
		}
		else {
			System.out.println("Given num is not a Strong number");
		}
	
	}

}

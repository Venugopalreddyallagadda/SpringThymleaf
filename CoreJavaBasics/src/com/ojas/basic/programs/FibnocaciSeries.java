package com.ojas.basic.programs;

import java.util.Scanner;

public class FibnocaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int a = 0, b = 1;
		for(int i = 1; i<=num; i++) {
			System.out.println(a);
		int  c = a+b;
		
		a = b;
		b = c;
		}
		System.out.println("The fibonacci series of given num is:"+num);
	}

}

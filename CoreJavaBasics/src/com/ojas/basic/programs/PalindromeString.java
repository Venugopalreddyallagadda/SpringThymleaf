package com.ojas.basic.programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String reverse = "";
		String  str = sc.next();
		
		for(int i = str.length();i>=1; i--) {
		   //	System.out.println(str.charAt(i-1));
			reverse = reverse+str.charAt(i-1);
		}
		if(str.equals(reverse)) {
			System.out.println("reverse string");
		}
		else {
			System.out.println("not a reverse string");
		}
		

	}

}

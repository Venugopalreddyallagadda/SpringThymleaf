package com.ojas.basic.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		int num = sc.nextInt();
		int n,temp, fact;
		int sum = 0;
	    temp = num;
	    while(num>0) {
	    	n = num%10;
	    	fact = 1;
	    	for(int i = 1; i<=n; i++) {
	    		fact = fact*i;
	    	}
	    	sum = sum+fact;
	    	num = num/10;
	    }
	    if(temp == sum) {
	    	System.out.println("Strong number");
	    }
	    else {
	    	System.out.println("Not Strong number");
	    }

	}

}

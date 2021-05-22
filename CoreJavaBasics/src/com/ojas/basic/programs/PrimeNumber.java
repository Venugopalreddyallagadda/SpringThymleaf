package com.ojas.basic.programs;

import java.util.Scanner;

public class PrimeNumber {
    static int count=0;
static boolean isPrime(int num) {
    for(int i=1;i<=num;i++) {
        if(num%i==0) {
            count ++;
        }
    }
    if(count==2) {
        return true;
    }else
    return false;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = sc.nextInt();
    
    System.out.println(isPrime(num));
    
    
}
}

package com.ojas.basic.programs;

import java.util.Scanner;

public class TwinPrimeNumber {
    static String res = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        System.out.println(twinPrime(sc.nextInt(), sc.nextInt()));
    }

    private static boolean isPrime(int num) {
        
        boolean b = false;
        int flag = 0;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag++;
                break;
            }
        }
        if (flag == 0) {
            b = true;
        }
        return b;
    }

    static String twinPrime(int start_value, int end_value) {
        for (int i = start_value; i <= end_value; i++) {
            if (isPrime(i) == true && isPrime(i + 2) == true) {
                res += " ( " + i + "," + (i + 2) + " )";
            }
        }
        return res;
    }
}
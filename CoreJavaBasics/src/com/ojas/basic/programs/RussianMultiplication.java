package com.ojas.basic.programs;

import java.util.Scanner;

public class RussianMultiplication {
    static void multiplication(int num1, int num2) {
        int product = 0;
        while (num1 != 0) {
            if (num1 % 2 != 0)
                product = product + num2;
            num1 = num1 / 2;
            num2 = num2 * 2;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        multiplication(num1, num2);

    }
}




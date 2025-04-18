package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate the Factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        calcFactorial(num);
    }

    public static void calcFactorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial of %d".formatted(n) + " is: %d".formatted(fact));
    }
}

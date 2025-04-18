package com.company;

import java.util.Scanner;

import static java.sql.DriverManager.println;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter the number to check Prime/not-Prime: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Check Using Function call");
        primeCheck(num);

        System.out.println("Check Using main method");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count += 1;
            }
        }
        if(count <= 2){
            System.out.println("The number is a prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
    public static void primeCheck(int n){
        int m = 0, flag =0;
        m = n / 2;
        if (n == 0 | n == 1){
            System.out.println("Not a Prime Number");
        }
        else {
            for (int i = 2; i <= m; i++){
                if (n % i == 0){
                    System.out.println("Not a Prime Number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n + " is a Prime Number");
            }
        }
    }
}
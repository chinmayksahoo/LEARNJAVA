package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check Armstrong number or Not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (checkArmstrongNum(num)){
            System.out.println(num + " is an Armstrong Number");
        }
        else {
            System.out.println(num + " is not an Armstrong Number" + "\n");
        }
        /*
            The following Java method prints all the Armstrong numbers up to the specified limit.
        */
        System.out.println("Below are the Armstrong numbers within the provided limit");
        System.out.println("*********************************************************");
        for (int i = 0; i <= num; i++) {
            if (checkArmstrongNum(i)){
                System.out.println(i);
            }
        }
    }

    /*
        The following Java method checks if the given number is an Armstrong number or not.
     */
    public static boolean checkArmstrongNum(int n){
        int tempnum, rem, digits = 0, sum = 0;
        tempnum = n;
        if (tempnum == 0){
            digits = 1;
        }
        while (tempnum > 0){
            tempnum /= 10;
            digits++;
        }
        tempnum = n;
        for (int i = 0; i <= digits ; i++) {
            rem = tempnum % 10;
            sum += Math.pow(rem, digits);
            tempnum /= 10;
        }
        return n == sum;
    }
}

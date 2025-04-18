package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Number/String");
        Scanner ip = new Scanner(System.in);
        String input = ip.nextLine();
        if (input.equals("")){
            System.out.println("Please Enter Number/String");
            System.out.println("Invalid Input");
        }
        else if (!input.equals("String") & !input.equals("Number")){
            System.out.println("Invalid Input");
        }
        else {
            if (input.equals("String")) {
                System.out.println("Enter a String to check Palindrome/not: ");
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                stringPalindromeCheck(str);
            } else {
                System.out.println("Enter a Number to check Palindrome/not: ");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                palindromeCheck(num);
            }
        }
    }

    public static void palindromeCheck(int n){
        int tnum = n, sum = 0, rem;
        while(n > 0){
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if (tnum == sum){
            System.out.println(tnum +" is a Palindrome");
        }
        else{
            System.out.println(tnum + " is not a Palindrome");
        }
    }

    public static void stringPalindromeCheck(String orig){
        StringBuilder rev = new StringBuilder();
        int len = orig.length();
        for (int i = len - 1; i >= 0; i--) {
            rev.append(orig.charAt(i));
        }
        if (orig.equals(rev.toString())){
            System.out.println(orig +" is a Palindrome");
        }
        else{
            System.out.printf("%s is not a Palindrome%n", orig);
        }
    }
}

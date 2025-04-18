package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 0;
        /**
         * Take input from the user through the console.
         * Used Scanner Class to take input.
         * Method 	                    Description
         * int nextInt() 	            It is used to scan the next token of the input as an integer.
         * float nextFloat() 	        It is used to scan the next token of the input as a float.
         * double nextDouble() 	        It is used to scan the next token of the input as a double.
         * byte nextByte() 	            It is used to scan the next token of the input as a byte.
         * String nextLine() 	        Advances this scanner past the current line.
         * boolean nextBoolean() 	    It is used to scan the next token of the input into a boolean value.
         * long nextLong() 	            It is used to scan the next token of the input as a long.
         * short nextShort() 	        It is used to scan the next token of the input as a Short.
         * BigInteger nextBigInteger() 	It is used to scan the next token of the input as a BigInteger.
         * BigDecimal nextBigDecimal() 	It is used to scan the next token of the input as a BigDecimal.
         */
        System.out.println("Enter the number to print fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

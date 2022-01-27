package com.company;

/*  Operators:
    Operator Type	Category	            Precedence
    --------------------------------------------------
    Unary	        postfix	                expr++ expr--
                    prefix	                ++expr --expr +expr -expr ~ !
    Arithmetic	    multiplicative	        * / %
                    additive	            + -
    Shift	        shift	                << >> >>>
    Relational	    comparison	            < > <= >= instanceof
                    equality	            == !=
    Bitwise	        bitwise AND	            &
                    bitwise exclusive OR	^
                    bitwise inclusive OR	|
    Logical	        logical AND	            &&
                    logical OR	            ||
    Ternary	        ternary	                ? :
    Assignment	    assignment	            = += -= *= /= %= &= ^= |= <<= >>= >>>=

*/

public class OperatorExamples {
    public static void main(String[] args){
        // Example: 1
        int x1 = 10;
        System.out.println(x1++);
        System.out.println(++x1);
        System.out.println(x1--);
        System.out.println(--x1);

        // Example: 2
        int a2 = 10;
        int b2 = 10;
        System.out.println(a2++ + ++a2);
        System.out.println(b2++ + b2++);

        //Example: 3
        int a3 = 10;
        int b3 = -10;
        boolean c3 = true;
        boolean d3 = false;
        System.out.println(~a3);        //  minus of total positive value which starts from 0 -> -11
        System.out.println(~b3);        //  positive of total minus, positive starts from 0 -> 9
        System.out.println(!c3);
        System.out.println(!d3);

        //Example: 4
        int a4 = 10;
        int b4 = 5;
        System.out.println(a4 + b4);
        System.out.println(a4 - b4);
        System.out.println(a4 * b4);
        System.out.println(a4 / b4);
        System.out.println(a4 % b4);

        //Example: 5
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

        //Example: 6(Left Shift Operator)
        System.out.println(10 << 2);      // 10*2^2=10*4=40
        System.out.println(10 << 3);      // 10*2^3=10*8=80
        System.out.println(20 << 2);      // 20*2^2=20*4=80
        System.out.println(15 << 4);      // 15*2^4=15*16=240

        //Example: 7(Right Shift Operator)
        System.out.println(10 >> 2);      // 10/2^2=10/4=2
        System.out.println(20 >> 2);      // 20/2^2=20/4=5
        System.out.println(20 >> 3);      // 20/2^3=20/8=2

        //Example: 8(>> vs >>>)
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        System.out.println(2 << -12345);    //Takes the 5 bits from the right
        System.out.println(2 << 33);        // When >32, takes the 5 bits from right
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);       // -20: 1111 1111 1111 1111 1111 1111 1110 1100 -> 1111 1111 1111 1111 1111 1111 1111 1011 = -5
        System.out.println(-20 >>> 2);      // -20: 1111 1111 1111 1111 1111 1111 1110 1100 -> 0011 1111 1111 1111 1111 1111 1111 1011 = 1073741819

        //Example: 9 (&& vs &)
        int a9 = 10;
        int b9 = 5;
        int c9 = 20;
        System.out.println((a9 < b9) && (a9 < c9));     // false && true = false
        System.out.println((a9 < b9) & (a9 < c9));      // false & true = false

        System.out.println((a9 < b9) && (a9++ < c9));   // false && true = false
        System.out.println(a9);                         // 10 because second condition is not checked
        System.out.println((a9 < b9) & (a9++ < c9));    // false && true = false
        System.out.println(a9);                         // 11 because second condition is checked

        //Example: 10 (|| vs |)
        int a10 = 10;
        int b10 = 5;
        int c10 = 20;
        System.out.println((a10 > b10) || (a10 < c10));     // true || true = true
        System.out.println((a10 > b10) | (a10 < c10));      // true | true = true

        System.out.println((a10 > b10) || (a10++ < c10));   // true || true = true
        System.out.println(a10);                            // 10 because second condition is not checked
        System.out.println((a10 > b10) | (a10++ < c10));    // true | true = true
        System.out.println(a10);                            // 11 because second condition is checked

        //Example: 11(Ternary operator)
        int a11 = 2;
        int b11 = 5;
        int min = (a11 < b11) ? a11:b11;                    // If condition a11 < b11 is TRUE, print a11 else print b11
        System.out.println(min);

        //Example: 12(Assignment Operator)
        int a12 = 10;
        int b12 = 20;
        a12 += 4;                                           // a12 = a12 + 4 (a12 = 10 + 4)
        b12 -= 4;                                           // b12 = b12 - 4 (b12 = 20 - 4)
        a12 *= 2;                                           // a12 = a12 * 2 (a12 = 14 * 2)
        b12 /= 2;                                           // b12 = b12 / 2 (b12 = 16 / 2)
        System.out.println(a12);
        System.out.println(b12);

        // Adding short
        short c12 = 10;
        short d12 = 10;
        //c12 = c12 + d12;                                    //Compile time error because 10+10=20 now int
        c12 = (short)(c12 + d12);
        System.out.println(c12);
    }
}

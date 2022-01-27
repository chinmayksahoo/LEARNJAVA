package com.company;

public class Variable {
    /*
        Static Variable: Can't be local. Can create a single copy of the static variable.
        It can be shared among all instance of the classes.
        Memory allocation happens for Static Variable only once when the class loaded in the memory.
     */
    static int m=100;
    void method()
    {
        int n = 90;         // local variable
        float f = n;
        float x = 10.5f;
        //int a = x;        // Compile time Error
        int a = (int)x;     // Typecasting
        int o = 50;
        int sum = n + o;
        int i = 130;
        byte b = (byte)i;   // Overflow -128 to 127:
        byte p = 10;
        byte q = 10;
        //byte r = p + q;     // Compile time Error. Because p + q = 30 which is int
        byte r = (byte)(p + q); // Adding Lower Type
        System.out.println(n);
        System.out.println(f);
        System.out.println(sum);
        System.out.println(x);
        System.out.println(a);
        System.out.println(i);
        System.out.println(b);
        System.out.println(r);
    }
    public static void main(String[] args){
        int data=50;    //instance variable
        Variable v = new Variable();
        v.method();
    }
}

/*  Data Types:
    byte => Default Size - 1 byte: value range -128 to 127 (inclusive)
    short => Default Size - 2 byte: value range -32,768 to 32,767 (inclusive)
    int => Default Size - 4 byte: value range 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive)
    long => Default Size - 8 byte: value range -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive)
    double => Default Size - 8 byte: value range is unlimited
    float => Default Size - 4 byte: value range is unlimited
    char => Default Size - 2 byte: value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
 */

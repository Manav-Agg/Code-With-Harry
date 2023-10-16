package com.manav;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b;

        b = 5 + a;
        System.out.println(b);

        b = 5 - 3;
        System.out.println(b);

        b = 11 % a;
        System.out.println(b);

        b += 3;
        System.out.println(b);

        b *= 3;
        System.out.println(b);
        System.out.println(6==8);
        System.out.println(64>6);
        System.out.println(64<6);
        System.out.println(64>6 && 64>98);
        System.out.println(64>6 || 64>98);

        // highest precedence goes to * and /. They are then evaluated on the basis
        // of left to right associativity
        int c = 6*5-34/2; //Precedence
        /*  30-34/2
        *   30-17
        *   13
        */

        int d = 60/5-34*2; //Associativity
        /*  12-34*2
        *   12-68
        *   13
        */

        System.out.println(c);
        System.out.println(d);
    }
}
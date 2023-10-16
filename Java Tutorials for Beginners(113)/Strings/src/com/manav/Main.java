package com.manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name = new String("Manav");
        String name = "Manav";
        System.out.print("The name is");
        System.out.println(name);

        int a = 6;
        float b = 5.6f;
        System.out.printf("Value of a is %d and value of b is %.2f", a, b);
        System.out.format("Value of a is %d and value of b is %.2f", a, b);

        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        System.out.println(st);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
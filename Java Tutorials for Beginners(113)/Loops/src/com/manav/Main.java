package com.manav;

public class Main {
    public static void main(String[] args) {
        System.out.println("While loop");
        int i = 1;
        while (i <= 3){
            System.out.println(i);
            i++;
        }
        System.out.println("Hello world!");

        System.out.println("Do-While loop");
        int a = 10;
        do {
                System.out.println(a);
                a++;
        }while (a <= 3);

        System.out.println("For loop");
        for(int j = 1; j < 10; j++){
            System.out.println(j);
        }

//        Write a program to print first n odd numbers in reverse order using a for loop.
        int n = 5;
        for(int c = n; c > 0; c--){
            System.out.println(2*c-1);
        }
    }
}
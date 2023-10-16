package com.manav;

public class Main {
    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int fact, n = 5;
        fact = factorial(n);
        System.out.println("The factorial of 5 is " + fact);
    }
}
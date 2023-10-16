package com.manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 60;
        marks[1] = 40;
        marks[2] = 20;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the index number");
            int ind = sc.nextInt();

            try {
                System.out.println("Welcome to my code");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
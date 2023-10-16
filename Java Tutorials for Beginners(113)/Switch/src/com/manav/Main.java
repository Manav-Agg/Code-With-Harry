package com.manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }

        char var = 'r';
        switch (var) {
            case 'r':
                System.out.println("You are going to become an adult");
                break;
            case 'c':
                System.out.println("You are going to join a job");
                break;
            case 'd':
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }

        String var1 = "Man";
        switch (var1) {
            case "Man" -> System.out.println("You are going to become an adult");
            case "Nan" -> System.out.println("You are going to join a job");
            case "Van" -> System.out.println("You are going to get retired");
            default -> System.out.println("Enjoy your life");
        }
    }
}
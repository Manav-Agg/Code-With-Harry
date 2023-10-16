package com.manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Write a program to calculate percentage of a given
        * student in CBSE board exam. His marks from 5
        * subjects must be taken as input from the keyboard
        * (Marks are out of 100).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CBSE Board percentage calculator");
        System.out.print("Enter marks in maths: ");
        float maths = sc.nextFloat();

        System.out.print("Enter marks in science: ");
        float science = sc.nextFloat();

        System.out.print("Enter marks in computer: ");
        float computer = sc.nextFloat();

        System.out.print("Enter marks in hindi: ");
        float hindi = sc.nextFloat();

        System.out.print("Enter marks in english: ");
        float english = sc.nextFloat();

        float sum = maths + science + computer + hindi + english;

        System.out.println("Enter total marks");
        float total = sc.nextFloat();
        float percentage = (sum / total) * 100;

        System.out.println("Your Percentage is " + percentage + "%");
    }
}
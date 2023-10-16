package com.manav;

public class Main {
    public static void main(String[] args) {
        int age = 6;
        boolean cond = (age == 18);
        if(cond){
            System.out.println("Yes boy you can drive");
        }
        else{
            System.out.println("No boy you cannot drive yet");
        }

        System.out.println("Logical operation of AND");
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("Logical operation of OR");
        boolean a1 = true;
        boolean b1 = true;
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("Logical operation of NOT");
        boolean a2 = true;
        boolean b2 = true;
        System.out.println("Not(a2) is " + !a2);
        System.out.println("Not(b2) is " + !b2);
    }
}
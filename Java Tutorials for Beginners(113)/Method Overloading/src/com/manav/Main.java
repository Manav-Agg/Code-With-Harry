package com.manav;

public class Main {

    static void foo(){
        System.out.println("Good Night bro");
    }

    static void foo(String name){
        System.out.println("Good Night " + name + " bro");
    }
    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word\n" + "Plagiarism");
    }
    public static void main(String[] args) {
        tellJoke();
//        Case 1: Changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: " + x);

//        Case 2: Changing the Array
        int[] marks = {52, 73, 77, 89, 98, 94};
        change2(marks); //It copy the address of the array that's why value will be changed
        System.out.println("The value of marks[0] element after running change is: " + marks[0]);

        foo();
        foo("Manav");
    }
}
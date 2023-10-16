package com.manav;
/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word <p>This is a new paragraph</p>
 * @author Manav
 * @version 1
 * @since 2022
 * @see <a href="https://docs.oracle.com/en/java/javase/20/docs/api/index.html" target="_blank:">Java Docs</a>
*/

public class Main {
    public void add(int a, int b){
        System.out.println("The sum is: " + a+b);
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
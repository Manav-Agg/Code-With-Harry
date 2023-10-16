package com.manav;

public class Main {
    static int sum(int ...arr){
//        Available as int [] arr;
        int result = 0;
        for(int element: arr){
            result = result + element;
        }
        return result;
    }

//    int x is mandatory in this method
//    static int sum(int x, int ...arr){
////        Available as int [] arr;
//        int result = x;
//        for(int element: arr){
//            result = result + element;
//        }
//        return result;
//    }

    public static void main(String[] args) {
//        varargs used to transfer arguments as array in other method
        System.out.println("The sum of 2 and 3 is " + sum(2, 3));
        System.out.println("The sum of 2, 3 and 4 is " + sum(2, 3, 4));
        System.out.println("The sum of 2, 3, 4 and 5 is " + sum(2, 3, 4, 5));
    }
}
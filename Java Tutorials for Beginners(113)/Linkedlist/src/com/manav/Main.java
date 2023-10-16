package com.manav;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> arr1 = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>();
        arr2.add(15);
        arr2.add(16);
        arr2.add(19);
        arr2.add(18);
        arr2.add(20);
        arr1.add(5);
        arr1.add(4);
        arr1.add(6);
        arr1.add(2, 5);
        arr1.add(0, 2);
        System.out.println(arr1.contains(2));
        System.out.println(arr1.indexOf(5));
        System.out.println(arr1.lastIndexOf(5));
        arr1.set(1, 566);
        arr1.addAll(arr2);
        arr1.addLast(1000);
        arr1.addFirst(500);
//        arr1.clear();
        for(int i = 0; i < arr1.size(); i++){
            System.out.print(arr1.get(i));
            System.out.print(", ");
        }
    }
}
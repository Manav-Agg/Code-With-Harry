package com.manav;

import java.util.ArrayList;
import java.util.Scanner;

class myGen<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGen(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T1 getT1() {
        return t1;
    }
}

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList();
////        ArrayList<int> arrayList = new ArrayList(); //This will produce an error
////        arrayList.add("str1");
//        arrayList.add(54);
//        arrayList.add(643);
////        arrayList.add(new Scanner(System.in));
//
//        int a = (int) arrayList.get(2);
////        System.out.println(a);

        myGen<String, Integer> g1 = new myGen(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
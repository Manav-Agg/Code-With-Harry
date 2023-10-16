package com.manav;

public class Main {
    static int logic(int x, int y){
//    int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5, b = 10, c;
//        Method invocation using object creation
//        Main obj = new Main();
//        c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(c);
    }
}
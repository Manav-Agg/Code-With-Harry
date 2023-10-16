package com.manav;

class myThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i < 40){
            System.out.println("myThread1 is for cooking...");
            System.out.println("I am happy...");
            i++;
        }
    }
}

class myThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 40){
            System.out.println("myThread2 is for chatting with her...");
            System.out.println("I am sad...");
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
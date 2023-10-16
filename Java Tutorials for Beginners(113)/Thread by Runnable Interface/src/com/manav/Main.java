package com.manav;

class myThread1 implements Runnable{
    public void run() {
        int i = 0;
        while(i < 20){
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }

    }
}

class myThread2 implements Runnable{
    public void run() {
        int i = 0;
        while(i < 20){
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myThread1 bullet1 = new myThread1();
        Thread gun1 = new Thread(bullet1);

        myThread2 bullet2 = new myThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
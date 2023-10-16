package com.manav;

class myThread extends Thread{
    public myThread(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i < 20){
            System.out.println("I am a thread " + this.getName());
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myThread t1 = new myThread("Manav");
        myThread t2 = new myThread("Titu");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
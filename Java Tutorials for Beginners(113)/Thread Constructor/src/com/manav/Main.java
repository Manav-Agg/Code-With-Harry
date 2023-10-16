package com.manav;

class myThread extends Thread{
    public myThread(String name){
        super(name);
    }

    public void run(){
            System.out.println("I am a thread");
    }
}

class myRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a runnable");
    }
}

public class Main {
    public static void main(String[] args) {
        myThread t1 = new myThread("Manav");
        myThread t2 = new myThread("Titu");

        myRunnable r = new myRunnable();
        Thread t = new Thread(r, "Aggarwal");

        t.start();
        t1.start();
        t2.start();

        System.out.println("The name of the thread t is " + t.getName());
        System.out.println("The id of the thread t is " + t.getId());

        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t1 is " + t1.getId());

        System.out.println("The name of the thread t2 is " + t2.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
    }
}
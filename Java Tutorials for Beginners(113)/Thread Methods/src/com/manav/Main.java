package com.manav;

class myThread1 extends Thread{
    public void run() {
        int i = 0;
        while(i < 20){
            System.out.println("Thank you " + this.getId());

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

            i++;
        }
    }
}

class myThread2 extends Thread{
    public void run() {
        int i = 0;
        while(i < 20){
            System.out.println("Thank you " + this.getId());
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();

        try{
            t1.join(); // It uses when t1 task is completed then t2 task is starting
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
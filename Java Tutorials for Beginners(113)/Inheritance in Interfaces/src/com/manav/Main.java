package com.manav;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class sampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }

    public void meth2(){
        System.out.println("meth2");
    }

    public void meth3(){
        System.out.println("meth3");
    }

    public void meth4(){
        System.out.println("meth4");
    }
}

public class Main {
    public static void main(String[] args) {
        sampleClass obj = new sampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
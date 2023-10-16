package com.manav;

abstract class Base{
    public Base(){
        System.out.println("I am constructor of Base class");
    }

    abstract public void greet();
}

class Derived extends Base{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class Child extends Base{
    public void th(){
        System.out.println("I am good");
    }
}

public class Main {
    public static void main(String[] args) {
//        Base base = new Base(); //error
        Derived d = new Derived();
//        Child ch = new Child(); //error
    }
}
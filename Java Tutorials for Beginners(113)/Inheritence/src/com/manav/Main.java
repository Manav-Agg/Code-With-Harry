package com.manav;

class Base{
    public int x;

    Base(){
        System.out.println("I am a constructor");
    }

    Base(int x){
        System.out.println("I am a overloaded constructor with value of x is " + x);
    }

    public void setX(int x) {
        System.out.println("I am in Base class and setting x now");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe(){
        System.out.println("I am a method");
    }
}

class Derived extends Base{
    public int y;

    Derived(){
//        super(5);
        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y){
        super(x);
        System.out.println("I am a overloaded constructor with value of y is " + y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overload constructor of Derived with value of z as: " + z);
    }
}

public class Main {
    public static void main(String[] args) {
        //Creating an Object of Base Class
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());

        //Creating an Object of Derived Class
//        Derived d = new Derived();
//        Derived derived = new Derived(14, 5);
//        d.setX(43);
//        System.out.println(d.getX());

//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd1 = new ChildOfDerived(11, 13, 15);
    }
}
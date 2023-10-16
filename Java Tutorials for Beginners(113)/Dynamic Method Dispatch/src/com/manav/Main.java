package com.manav;

class Phone{
    public void showTime(){
        System.out.println("Time is 5 pm");
    }

    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{

    public void music(){
        System.out.println("Playing Music...");
    }

    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Main {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
//        SmartPhone obj1 = new Phone(); //Not allowed
        obj.showTime();
        obj.on();
//        obj.music(); //Not Allowed
    }
}
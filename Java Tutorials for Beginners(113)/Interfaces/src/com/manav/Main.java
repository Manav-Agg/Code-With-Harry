package com.manav;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface BlowHorn{
    void blowHornK3G();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, BlowHorn{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }

    public void blowHornK3G() {
        System.out.println("Kabhi Khushi Kabhi Gum");
    }

    public void blowHornmhn() {
        System.out.println("Main Hoon Naa");
    }
}

public class Main {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(1);

//        You can create properties in interfaces
        System.out.println(ac.a);
//        You cannot modify the properties in interfaces as they are final
        //ac.a = 534;

        ac.blowHornK3G();
        ac.blowHornmhn();
    }


}
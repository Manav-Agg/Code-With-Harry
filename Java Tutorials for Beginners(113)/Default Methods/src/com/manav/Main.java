package com.manav;

interface Camera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }

    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Record Video");
    }

//    public void record4kVideo() {
//        System.out.println("Record Video in 4K");
//    }

    public String[] getNetworks() {
        System.out.println("Getting list to Networks");
        String[] networkList = {"Manav", "Vashu", "Yogi"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.record4kVideo();
//        sp.greet(); //It is private we can't run this
        String[] arr = sp.getNetworks();        for (String item: arr) {
            System.out.println(item);
        }
    }
}
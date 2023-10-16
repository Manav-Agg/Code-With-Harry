package com.manav;

@FunctionalInterface
interface demoAno{
    int x = 45;
    void meth1(int a);
}

//class fun implements demoAno{
//    @Override
//    public void meth1() {
//        System.out.println("I am method 1");
//    }
//}
//
//class AnonyDemo implements demoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//}

public class Main {

    public static void main(String[] args) {
//        demoAno obj = new AnonyDemo();
//        obj.meth1();

//        Anonymous Class
//        demoAno obj = new demoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

//        Lambda Expression
//        demoAno obj = new fun();
//        obj.meth1();

        demoAno obj = (a)->{
            System.out.println("I am method 1 from this lambda. " + a);
        };
        obj.meth1(5);
    }
}
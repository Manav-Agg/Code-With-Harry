package com.manav;
public class Main {

    @FunctionalInterface
    interface myFunctionalInterface {
        void method1();
//        void method2();
    }

    static class KeyPadPhone{
        @Deprecated
        void sendMessage(){
            System.out.println("Text message sent!");
        }
    }

    static class AndroidPhone extends KeyPadPhone{
        @Override
        void sendMessage(){
            System.out.println("Message sent via WhatsApp!");
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
        System.out.println("Functional interface annotation");
    }
}
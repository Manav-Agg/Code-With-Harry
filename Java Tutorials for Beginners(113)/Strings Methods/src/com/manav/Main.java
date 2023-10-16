package com.manav;

public class Main {
    public static void main(String[] args) {
        String name = "Manav";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "      Manav          ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 5));
        System.out.println(name.replace('n', 'a'));
        System.out.println(name.replace("ana", "anna"));
        System.out.println(name.startsWith("Ma"));
        System.out.println(name.endsWith("v"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("n"));
        System.out.println(name.indexOf("na", 2));
        System.out.println(name.lastIndexOf("av"));
        System.out.println(name.lastIndexOf("av", 3));
        System.out.println(name.equals("Manav"));
        System.out.println(name.equalsIgnoreCase("MaNaV"));
        System.out.println("I am escape sequence \" double quote");
    }
}
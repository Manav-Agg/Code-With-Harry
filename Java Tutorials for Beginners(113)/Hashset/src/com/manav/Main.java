package com.manav;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>(6, 0.5f);
        hs1.add(6);
        hs1.add(8);
        hs1.add(3);
        hs1.add(11);
        hs1.add(11);
        System.out.println(hs1);
    }
}
package com.manav;

public class Main {
    public static void main(String[] args) {
//        method 1:
        int[] a = new int[5];
//        method 2:
        int[] b;
        b = new int[5];
//        method 3:
        int[] c = {1, 2, 3, 4, 5};

//        Displaying the array (Naive way)
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println(c[4]);

//        Displaying the array (for loop)
        System.out.println("Printing using for loop");
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

        System.out.println("Printing using for loop in reverse order");
        for(int i = c.length - 1; i >= 0; i--){
            System.out.println(c[i]);
        }

//        For each loop
        System.out.println("Printing using for each loop");
        for(int element: c){
            System.out.println(element);
        }

//        Multi Dimension array
        int [][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing using 2D array");
        for(int i = 0; i < flats.length; i++){
            for(int j = 0; j <flats[0].length; j++){
                System.out.print(flats[i][j]);
                System.out.print("    ");
            }
            System.out.println(" ");
        }
    }
}
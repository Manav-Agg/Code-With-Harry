package com.manav;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Code to create a new file
        /*
        File myFile = new File("manav.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        //Code to write to a file
        try {
            FileWriter myFile = new FileWriter("manav.txt");
            myFile.write("This is our first line in this filewriter\nOkay now bye");
            myFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading a file
        File myFile = new File("manav.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
         */

        //Deleting a file
        File myFile = new File("manav.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting the file");
        }
    }
}
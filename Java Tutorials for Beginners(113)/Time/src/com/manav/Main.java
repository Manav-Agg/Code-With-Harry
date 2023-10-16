package com.manav;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now(); //This is the date
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy -- E h:m a"); //This is the format
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = ldt.format(dtf); // Creating data string using date and format
        System.out.println(myDate);
    }
}
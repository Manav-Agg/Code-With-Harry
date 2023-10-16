package com.manav;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee manav = new Employee(); //Instantiating a new Employee Object
        Employee vashu = new Employee(); //Instantiating a new Employee Object

        //Setting attributes for manav
        manav.id = 01;
        manav.name = "Manav";
        manav.salary = 100000;

        //Setting attributes for vashu
        vashu.id = 02;
        vashu.name = "Vashu";
        vashu.salary = 50000;

        //Printing the attributes
        manav.printDetails();
        vashu.printDetails();
//        System.out.println(manav.id);
//        System.out.println(manav.name);

        int salary = vashu.getSalary();
        System.out.println(salary);
    }
}
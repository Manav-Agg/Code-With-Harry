package com.manav;

class Employee{
    private int id;
    private String name;

    public Employee(){
        id = 45;
        name = "Your Name";
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manav = new Employee(01, "Manav");
        System.out.println(manav.getId());
        System.out.println(manav.getName());
    }
}
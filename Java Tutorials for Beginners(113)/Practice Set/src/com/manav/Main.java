package com.manav;

import java.util.Scanner;

import static java.lang.Math.sin;

interface myInt{
    void display();
}

class myDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

class customException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class GoodMorning extends Thread{
    public void run(){
        int i = 0;
        while(i < 20){
            System.out.println("Good Morning");
            i++;
        }

    }
}

class Welcome extends Thread{
    public void run(){
        int i = 0;
        while(i < 20){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }

    }
}

class Calculator{
    Calculator(int a, int b){
        System.out.println("Your result is " + a+b);
    }
}

class ScCalculator extends Calculator{
    ScCalculator(int a, int b){
        super(a, b);
        System.out.println("Your result is " + sin(a+b));
    }
}

class HybridCalculator extends ScCalculator{
    HybridCalculator(int a, int b){
        super(a, b);
        System.out.println("Your result is " + a+b);
        System.out.println("Your result is " + sin(a+b));
    }
}
interface TVRemote{
    void buttons();
}

interface SmartTVRemote extends TVRemote{
    void smartButtons();
    void led();
}

class TV implements TVRemote{
    public void buttons(){
        System.out.println("Changing channels...");
    }
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone extends TelePhone{
    void ring() {
        System.out.println("Ringing...");
    }

    void lift() {
        System.out.println("Lifting...");
    }

    void disconnect() {
        System.out.println("Disconnecting...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }

    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir...");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }

    void refill(){
        System.out.println("Refill");
    }

    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

class Circle1{
    public int radius;

    Circle1(int r){
        System.out.println("I am param of circle class");
        this.radius = r;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;

    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am param of Cylinder Class");
        this.height = h;
    }

    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}

class Rectangle1{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area(){
        return this.length * this.breadth;
    }
}

class Cuboid extends Rectangle1{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public double volume(){
        return this.length * this.breadth * this.height;
    }
}

class Cylinder{
    private int radius, height;

    public Cylinder(){
        System.out.println("Default Constructor");
    }

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public float surfaceArea(int radius, int height){
        return (float)(2*Math.PI*radius*height) + (float)(2*Math.PI*radius*radius);
    }

    public float volume(int radius, int height){
        return (float)(Math.PI*radius*radius*height);
    }
}

class Rectagle{
    private int length, breadth;

    public Rectagle(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectagle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float surfaceArea(float radius){
        return (float)(4*Math.PI*radius*radius);
    }

    public float volume(float radius){
        return (float) (4/3*Math.PI*radius*radius*radius);
    }
}

class Employee{
    int salary;
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("ringing");
    }

    public void vibrate(){
        System.out.println("Vibrating");
    }
}

class Square{
    int side;

    public int area(){
        int ar = side^2;
        return ar;
    }

    public int perimeter(){
        int peri = 4 * side;
        return peri;
    }
}

class Rectangle{
    int length, breath;

    public int area(){
        int ar = length * breath;
        return ar;
    }

    public int perimeter(){
        int peri = 2 * (length + breath);
        return peri;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting");
    }

    public void run(){
        System.out.println("Running");
    }

    public void fire(){
        System.out.println("Firing");
    }
}

class Circle{
    float radius;

    public float area(){
        float ar = (float) (3.14 * radius);
        return ar;
    }

    public float perimeter(){
        float peri = (float) (2 * 3.14 * radius);
        return peri;
    }
}

public class Main {
    static void multiplication(int n){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }

    static void pattern1(int n){
        for(int i= 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sum(n - 1);
        }
    }

    static void pattern2(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int fib(int n){
        /*
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        */
        if(n == 1 || n == 2){
            return n - 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    static float average(float x, float ... arr){
        float length = x, result = 0, sum = 0;
        for(int i = 0; i < length; i++){
            sum = sum + arr[i];
        }
        result = sum / length;
        return result;
    }

    static void pattern1_rec(int n){
        if(n > 0){
            pattern1_rec(n - 1);
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static float celsius(int n){
        float fah, c = n;
        fah = (c * 9 / 5) + 32;
        return fah;
    }
    static int add(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
//        Practice Set = 1
//        Write a program to sum of three numbers
        int num1 = 10;
        int num2 = 5;
        int num3 = 6;
        int sum = num1 + num2 + num3;
        System.out.println("Sum of three numbers are " + sum);

//        Write a program to calculate CGPA using marks of three subjects
        float sub1 = 45;
        float sub2 = 50;
        float sub3 = 60;
        float cgpa = (sub1 + sub2 + sub3) / 30;
        System.out.println(cgpa);

//          Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day.");

//        Write a java program to convert kilometers to miles
        System.out.println("Enter kilometers: ");
        float kilometers = sc.nextFloat();
        float mile = 0.621371f;
        float miles = kilometers * mile;
        System.out.print("Total miles in " + kilometers + " kilometers are " + miles);

//        Write a java program to detect whether a number entered by the user is integer or not
        System.out.println("\nEnter a number: ");
        System.out.println(sc.hasNextInt());
        */


        /*
//        Practice Set = 2
//        What will be the result of the following expression float a = 7 / 4 * 9 / 2
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);

//        Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println(grade);

//        Use comparison operators to find out whether a given number is greater than the user entered number or not.
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num > 8);

//        Write the following expression in a java program: v2 - u2 / 2as
//        (v^2 - u^2) / (2 * a * s)

//        Find the value of the following expression: int x = 7; int a = 7 * 49/7 + 35/7;
        int b = 7 * 49/7 + 35/7;
        System.out.println(b);
         */


        /*
//        Practice Set = 3
//        Write a java program to convert a string to lowercase
        String sentence = "MANAV IS A GOOD BOY";
        sentence = sentence.toLowerCase();
        System.out.println(sentence);

//        Write a java program to replace spaces with underscores
        String str = "MANAV IS A GOOD BOY";
        str = str.replace(' ', '_');
        System.out.println(str);

//        Write a java program to fill in a letter template which looks like below:
//        letter = "Dear <|name|>, Thanks a lot"
//                Replace <|name|> with a string (Some name)
        String letter = "Dear <|name|> Thanks a lot";
        letter = letter.replace("<|name|>", "Manav");
        System.out.println(letter);

//        Write a java program to detect double and triple spaces in a string
        String mystring = "This string contains double and  triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

//        Write a program to format the following letter using escape sequence characters
//                letter = "Dear Manav, This java course is nice. thanks"
        String myletter = "Dear Manav,\n\tThis java course is nice.\n\tThanks";
        System.out.println(myletter);
         */


        /*
//        Practice Set = 4
//        What will be the output of this program
//            int a = 10;
//            if(a = 11){
//                System.out.println("I am 11");
//            }
//            else{
//                System.out.println("I am not 11");
//            }
//        Ans - This shows an error in if condition

//        Write a program to find out whether a student is pass or fail;if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.
        byte m1, m2, m3;
        System.out.print("Enter your marks in maths: ");
        m1 = sc.nextByte();

        System.out.print("Enter your marks in computer: ");
        m2 = sc.nextByte();

        System.out.print("Enter your marks in english: ");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
            System.out.println("Congrats, you have been promoted");
        }
        else{
            System.out.println("Sorry, you have not been promoted");
        }

//        Calculate income tax paid by an employee to the government as per the slabs mentioned below
//        Income slab     tax
//        2.5l-5.0l       5%
//        5.0l-10.0l      20%
//        Above 10.0l     30%
//        Note that there is no tax below 2.5l. Take input amount as an input from the user.
        System.out.print("Enter your income in lakhs per annum: ");
        float tax = 0;
        float income = sc.nextFloat();
        if(income <= 2.5){
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5.0f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);

//        Write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday ... and so on!]
        int day;
        System.out.print("Enter day number: ");
        day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong input");
        }

//        Write a java program to find whether a year entered by the user is a leap year or not.
        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("It is leap year");
                }
                else{
                    System.out.println("It is not leap year");
                }
            }
            else{
                System.out.println("It is leap year");
            }
        }
        else{
            System.out.println("It is not leap year");
        }

//        Write a program to find out the type of website from the url
//        .com -> commercial website; .org -> organization website; .in -> indian website
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }
         */


        /*
//        Practice Set 5
//        Write a program to print the following pattern
//        ****
//        ***
//        **
//        *
        int n = 4;
        for(int a = n; a > 0; a--){
            for(int b = 0; b < a; b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        Write a program to sum first n even numbers using while loop
        int num, i = 0, sum = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while(i < num){
            sum = sum + (2 * i);
            i++;
        }
        System.out.println("The sum of even numbers is " + sum);

//        Write a program to print multiplication table of a given number n.
        int tab, multi = 0, j;
        System.out.print("Enter a number: ");
        tab = sc.nextInt();
        for(j = 1; j <= 10; j++){
            multi = tab * j;
            System.out.println(tab + " * " + j + " = " + multi);
        }

//        Write a program to print multiplication table of 10 in reverse order.
        int no = 10;
        for(int c = no; c >= 1; c--){
            System.out.println(no + " * " + c + " = " + no * c);
        }

//        Write a program to find factorial of a given number using for loops
        int m, k = 1, factorial = 1;
        System.out.println("Enter a number: ");
        m = sc.nextInt();
        for(k = 1; k <= m; k++){
            factorial = factorial * k;
        }
        System.out.println("Factorial of " + m + " is " + factorial);

//        Write a program to find factorial of a given number using while loops
        int fact = 1, l = 1;
        while(l <= m){
            fact = fact * l;
            l++;
        }
        System.out.println("Factorial of " + m + " is " + fact);

//        Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int e, add = 0, eight = 8;
        for(e = 1; e <= 10; e++){
            add = add + (eight * e);
        }
        System.out.println("Sum of numbers occurring in 8 is " + add);
        */


        /*
//        Practice Set 6
//        Create an array of 5 floats and calculate their sum.
        float[] arr = {20f, 40f, 60f, 80f, 100f};
        float sum = 0;
        for(float element: arr){
            sum = sum + element;
        }
        System.out.println("The sum of array is " + sum);

//        Write a program to find out whether a given integer is present in an array or not.
        float[] ar = {20f, 40f, 60f, 80f, 100f};
        float num = 80f;
        boolean isInArray = false;
        for(float element: ar){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

//        Calculate the average marks from an array containing marks of all subjects in physics using for-each loop
        int[] marks = {33, 60, 80, 40, 100};
        int sum = 0;
        for(int element: marks){
            sum = sum + element;
        }
        System.out.println("The average of marks is " + sum/marks.length);

//        Create a java program to add two matrices of size 2 x 3
        int[][] mat1 = {{1, 3, 5},
                        {7, 9, 11}};
        int[][] mat2 = {{2, 4, 6},
                        {8, 10, 12}};
        int[][] result = {  {0, 0, 0},
                            {0, 0, 0}};
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

//        Write a java program to reverse an array.
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = Math.floorDiv(arr.length, 2), l = arr.length, temp;
        for(int i = 0; i < n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }

//        Write a java program to find the maximum element in an array
        int[] arr = {1, 21, 3, 455, 5, 34, 67};
        int max = 0;
        for(int e : arr){
            if(e > max){
                max = e;
            }
        }
        System.out.println("The maximum element in this array is " + max);

//        Write a java program to find the minimum element in an array
        int[] arr = {21, 3, 455, 5, 34, 67};
        Arrays.sort(arr);
        System.out.println("The minimum element in this array is " + arr[0]);

//        Write a java program to find whether an array is sorted or not
        boolean isSorted = true;
        int [] arr = {1, 21, 3, 455, 5, 34, 67};
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
         */


        /*
//        Practice Set 7
//        Write a java method to print multiplication table of a number n
        int n = 7;
        multiplication(n);

//        Write a program using functions to print the following pattern
//        *
//        **
//        ***
//        ****
        pattern1(4);

//        Write a recursive function to calculate sum of first n natural numbers
        int result = sum(4);
        System.out.println("The sum of natural numbers are " + result);

//        Write a function to print the following pattern
//        ****
//        ***
//        **
//        *
        pattern2(4);

//        Write a function to print nth term of fibonacci series using recursion
//        Fibonacci Series - 0 1 1 2 3 5 8 13 21 34
        int result = fib(4);
        System.out.println(result);

//        Write a function to find average of a set of numbers passed as arguments
        System.out.println("The average of numbers are " + average(2f, 2f, 3f));

//        Repeat pattern1 using recursion
        pattern1_rec(4);

//        Write a function to convert Celsius temperature into Fahrenheit.
        int n = 35;
        System.out.println("The temperature in fahrenheit is " + celsius(n));
//        Repeat sum of natural numbers using iterative method
        System.out.println(add(4));
         */


        /*
//        Practice Set 8
//        Create a class Employee with following properties
//        Salary(property)(int)
//        getSalary(method returning int)
//        name(property)(String)
//        getName(method returning String)
//        setName(method changing name)
        Employee e = new Employee();
        e.setName("Manav");
        System.out.println(e.getName());

        e.salary = 10000;
        System.out.println(e.getSalary());

//        Create a class cellphone with methods to print "ringing", "vibrating" etc
        cellPhone cell = new cellPhone();
        cell.ring();
        cell.vibrate();

//        Create a class Square with a method to initialize its side, calculating area, perimeter etc
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area())
        System.out.println(sq.perimeter());

//        Create a class rectangle with a method to initialize its side, calculating area, perimeter etc
        Rectangle rec = new Rectangle();
        rec.length = 6;
        rec.breath = 4;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

//        Create a class TommyVecetti for rockstar games capable of hitting (print hitting), running, firing etc.
        Tommy tom = new Tommy();
        tom.hit();
        tom.run();
        tom.fire();

//        Create a class circle with a method to initialize its radius, calculating area, perimeter etc
        Circle cr = new Circle();
        cr.radius = 5f;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
         */


        /*
//        Practice Set 9
//        Create a class cylinder and use getters and setters to set its radius and height.
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(12);
        cylinder.setRadius(5);
        int radius = cylinder.getRadius();
        int height = cylinder.getHeight();
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);

//        Use 1 to calculate surface area and volume of the cylinder.
        float area = cylinder.surfaceArea(radius, height);
        float volume = cylinder.volume(radius, height);
        System.out.printf("%.2f area of cylinder and %.2f volume of cylinder", area, volume);

//        Use a constructor and repeat 1
        Cylinder cylinder1 = new Cylinder(5, 12);

//        Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
        Rectagle rectagle = new Rectagle();
        Rectagle rectagle1 = new Rectagle(6, 4);
        System.out.println("length = " + rectagle.getLength() + " and breadth = " + rectagle.getBreadth());
        System.out.println("length = " + rectagle1.getLength() + " and breadth = " + rectagle1.getBreadth());

//        Create a class sphere and use getters and setters to set its radius and height.
        Sphere sphere = new Sphere();
        sphere.setRadius(5.5f);
        float radius = sphere.getRadius();
        System.out.printf("Area is %.2f and volume = %.2f ", sphere.surfaceArea(radius), sphere.volume(radius));
         */


        /*
//        Practice Set 10
//        Create a class Circle and use inheritance to create another class Cylinder from it
//        Circle1 obj = new Circle1(12);
        Cylinder1 obj1 = new Cylinder1(12, 7);

//        Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world Scenario as possible.
        Cuboid cube = new Cuboid(10, 7, 5);
        double area = cube.area();
        double volume = cube.volume();
        System.out.println(area + " and " + volume);

//        Create methods for area and volume in 1.
        Cylinder1 obj = new Cylinder1(12, 7);
        double area = obj.area();
        double volume = obj.volume();
        System.out.format("%.2f and %.2f", area, volume);

//        Create methods for area and volume in 2. Also create getters and setters.
        Cuboid cube = new Cuboid();
        cube.setHeight(12, 7, 5);
        double area = cube.area();
        double volume = cube.volume();
        System.out.format("%.2f and %.2f", area, volume);
        */


        /*
//        Practice Set 11
//        Create an abstract class Pen with methods write() and refill() as abstract method
//        Use the pen class from Q1 to create a concrete class FountainPen with additional method changeNib()
        FountainPen pen = new FountainPen();
        pen.changeNib();

//        Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
        Human manav = new Human();
        manav.speak();

//        Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism.
        TelePhone TP = new SmartTelePhone();
        TP.ring();
        TP.lift();
        TP.disconnect();

//        Demonstrate polymorphism using monkey class from Q3.
        Monkey monk = new Human();
        monk.jump();
        BasicAnimal ba = new Human();
        ba.sleep();
//        monk.speak(); //Can't use speak method because the reference is monkey does not have speak method.

//        Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
//        Create a class TV which implements TVRemote interface from Q6.
        TV tv = new TV();
        tv.buttons();
        */


        /*
//        Practice Set 12
//        Create three classes Calculator, ScCalculator and HybridCalculator and group them into a package.
        HybridCalculator hc = new HybridCalculator(5, 5);

//        Use a built-in package in java to write a class which displays a message (by using sout) after taking input from the user.
//        Create a package in class with three package levels folder, folderL1, folderL2.
//        folder-->folderL1-->folderL2
        */


        /*
//        Practice Set 13
//        Write a program to print "good morning" and "welcome" continuously on the screen in java using Threads.
        GoodMorning gm = new GoodMorning();
        Welcome wel = new Welcome();
        gm.start();
        wel.start();

//        Add a sleep method in welcome thread of Q1 to delay its execution for 200ms.
        GoodMorning gm = new GoodMorning();
        Welcome wel = new Welcome();
        gm.start();
        wel.start();

//        Demonstrate getPriority() and setPriority() methods in java threads.
        GoodMorning gm = new GoodMorning();
        Welcome wel = new Welcome();
        gm.setPriority(6);
        wel.setPriority(9);
        System.out.println("Priority of gm is " + gm.getPriority());
        System.out.println("Priority of wel is " + wel.getPriority());
        gm.start();
        wel.start();

//        How do you get state of a given thread in java?
        GoodMorning gm = new GoodMorning();
        System.out.println(gm.getState());
        gm.start();
        System.out.println(gm.getState());

//        How do you get reference to the current thread in java?
        Welcome wel = new Welcome();
        wel.start();
        System.out.println(Thread.currentThread().getState());
         */


        /*
//        Practice Set 14
//        Write a java program to demonstrate syntax, logical and runtime errors.
        Syntax error -->    int a = 10
        Logical error -->   int age = 78;
                            int year_born = 2000 - age;
        Runtime error -->   System.out.println(6 / 0);

//        Write a java program that prints "Haha" during Arithmetic exception and "Hehe" during an Illegal argument exception.
        try{
            int a = 666 / 0;
        }
        catch(IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch(ArithmeticException e){
            System.out.println("Haha");
        }

//        Write a program that allows you to keep assuming an array until a valid index is given. If max retries exceed 5 print "Error".
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        int index, i = 0;
        while(flag && i < 5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }

//        Modify program in Q3 to throw a custom Exception if max retries are reached.
        if(i >= 5){
            try {
                throw new customException();
            }
            catch (customException e) {
                throw new RuntimeException(e);
            }
        }
        */


        /*
//       Advance Practice Set 1
//        Create an Arraylist and store names of 10 students inside it and print it using a for-each loop
        ArrayList ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");

        for (Object o: ar) {
            System.out.println(o);
        }

//        Use the Date class in Java to print time in the following format: 21:47:02
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

//        Repeat Q2 using the calendar class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

//        Repeat Q2 using the java.time API
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("h:m:s a");
        String myDate = dt.format(df);
        System.out.println(myDate);

//        Create a set in java. Try to store duplicate elements inside this set and verify that only one instance is stored.
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(10);
        s.add(15);
        s.add(10);
        s.add(5);
        System.out.println(s);
         */


        /*
//       Advance Practice Set 2
//        Create a class and add a method with deprecated annotation. What is its effect on program execution. Suppress the generated warnings.
        @SuppressWarnings("Deprecation")
        myDeprecated d = new myDeprecated();
        d.meth1();

//        Create an interface and generate an instance from it.
        myInt i = () -> System.out.println("I am display");

//        Write a program to generate multiplication table of a given number and write it to a file.
        int i = 5;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X" + (j+1) + "=" + i * (j+1);
            table += "\n";
        }
        try{
            FileWriter myFile = new FileWriter("MultiplicationTable.txt");
            myFile.write(table);
            myFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
         */
    }
}
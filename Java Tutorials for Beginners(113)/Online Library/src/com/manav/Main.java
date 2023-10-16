package com.manav;

class Library{
    String[] books;
    int noOfBooks;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book: this.books) {
            if(book == null){
                continue;
            }
            System.out.println("--> " + book);
        }
    }

    void issueBook(String book){
        for(int i = 0; i < this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println(book + " book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        System.out.println(book + " book has returned");
        addBook(book);
    }
}

public class Main {
    public static void main(String[] args) {
//        You have to implement a library using Java Class Library
//        Methods: addBook, issueBook, returnBook, showAvailableBooks
//        Properties: Array to store the available books,
//        Array to store the issued books
        Library cl = new Library();
        cl.addBook("Think and grow rich");
        cl.addBook("Algorithms");
        cl.addBook("C++");
        cl.addBook("JAVA");
        cl.showAvailableBooks();

        cl.issueBook("C++");
        cl.showAvailableBooks();

        cl.returnBook("C++");
        cl.showAvailableBooks();
    }
}
package ExampleOfMap;
//Create a Class with name Book having fields as booktitle,authorname,price.
//        Create a LinkedHashMap of such 5 books.

import java.util.*;
class Book{
    private String bookTitle;
    private String authorName;
    private double price;

    // Constructor
    public Book(String bookTitle , String authorName , double price){
        this.bookTitle = bookTitle;
        this.authorName =authorName;
        this.price = price;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
public class LinkedHashmapExample {
    public static void main(String[] args) {
        // Adding 5 books to the LinkedHashMap
        LinkedHashMap<Integer , Book> bookDetails = new LinkedHashMap<Integer , Book>();
        bookDetails.put(0001, new Book("C Programming", "Dennis M. Ritchie", 34.57));
        bookDetails.put(0002, new Book("C++ Programming", "Bjarne Stroustrup", 25.89));
        bookDetails.put(0003, new Book("Java", "Dr. R. Nageswara Rao", 38.87));
        bookDetails.put(0004, new Book("OS", "Abraham Silberschatz ", 38.87));
        bookDetails.put(0005, new Book("DAA", "Narasimha Karumanchi.", 25.00));
        // Printing out the LinkedHashMap of books
        System.out.println(/*---------------*/);
        for (Integer id : bookDetails.keySet()) {
            System.out.println("Id: " + id + ", Book Details: " + bookDetails.get(id));
        }
    }
}

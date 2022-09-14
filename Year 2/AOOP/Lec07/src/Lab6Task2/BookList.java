/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6Task2;

/**
 *
 * @author HP
 */
import java.util.*;

public class BookList {

    private ArrayList<Book> books;

    public BookList() {
    //Write the code for the constructor:      
    //Initialize the instance variable books
        books = new ArrayList<Book>();
    }

    public void addBook(String t, String i, String a) {
    //Write the code for addBook
    //Creates a book with its title t, isbn i and author a. Then adds the newly
    //created book to the arraylist books.
        books.add(new Book(t, i, a));
    }
    
    void listAll() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        BookList bList = new BookList();
    //use the method addBook to add following books
    //to the list bList in the order as shown below.
    //title: “Calculus”, isbn: “1234”, author: “Goldstein”
    //title: “Java”, isbn: “5678”, author: “Gosling”
    //title: “Algorithms”, isbn: “4629”, author: “Cormen”
        bList.addBook("Calculus", "1234", "Goldstein");
        bList.addBook("Java", "5678", "Gosling");
        bList.addBook("Algorithms", "4629", "Cormen");
    //show all books 
        System.out.println("List of Books: ");
        bList.listAll();
    //Sort books by title and show result
        Collections.sort(bList.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }            
        });
        System.out.println("List of Books Sorted by Title: ");
        bList.listAll();
    //Sort books by isbn and show result
        Collections.sort(bList.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getIsbn().compareTo(o2.getIsbn());
            }            
        });
        System.out.println("List of Books Sorted by ISBN: ");
        bList.listAll();
    //Sort books by author and show result
        Collections.sort(bList.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }            
        });
        System.out.println("List of Books Sorted by Author: ");
        bList.listAll();
    }
}

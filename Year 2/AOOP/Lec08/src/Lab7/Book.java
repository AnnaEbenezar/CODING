/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author HP
 */
public class Book implements Media {
    
    private String id;
    private String author;
    private String title;
    private int year;

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }       

    @Override
    public <T> Comparable<T> getId() {
        return (Comparable<T>) id;
    }

    @Override
    public String getCreator() {
        return author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getYear() {
        return this.year;
    }
    
}

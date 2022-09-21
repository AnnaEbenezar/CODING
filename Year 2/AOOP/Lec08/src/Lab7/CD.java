/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author HP
 */
public class CD implements Media {
    
    private Integer id;
    private String artist;
    private String title;
    private int year;

    public CD(Integer id, String artist, String title, int year) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public <T> Comparable<T> getId() {
        return (Comparable<T>) id;
    }

    @Override
    public String getCreator() {
        return artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }
    
}

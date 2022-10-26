/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11Task1;

/**
 *
 * @author HP
 */
public class Person {
    
    protected ReadingBehaviour readingBehaviour;

    public void setReadingBehaviour(ReadingBehaviour readingBehaviour) {
        this.readingBehaviour = readingBehaviour;
    }
    
    public void read() {
        readingBehaviour.read();
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName();
    }

       
    
}

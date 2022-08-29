/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayListExample;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Beatles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList band = new ArrayList();
        band.add("Paul");
        band.add("Pete");
        band.add("John");
        band.add("George");
        int location = band.indexOf("Pete");
        band.remove(location);
        System.out.println("At index 1: " + band.get(1));
        band.add(2, "Ringo");
        System.out.println("Size of the band: " + band.size());

    }

}

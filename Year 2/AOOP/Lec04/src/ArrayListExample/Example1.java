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
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList club = new ArrayList();
        club.add(new String("Spanky"));
        club.add("Darla");
        club.add("Buckwheat");
        System.out.println(club);
        System.out.println(club.size());
        
        club.set(1, "Mikey");
        System.out.println(club);
        
        club.add(0, club.remove(club.size()-1));
        System.out.println(club);
        
        
    }
    
}

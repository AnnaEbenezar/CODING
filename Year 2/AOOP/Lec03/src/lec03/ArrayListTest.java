/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec03;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ArrayListTest {

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
        club.set(1, "Mikey");
        System.out.println(club);

        //Object o1 = club.remove(2);
        //club.add(0, o1);
        //System.out.println(club);
        club.add(0, club.remove(2));
        System.out.println(club);

    }

}

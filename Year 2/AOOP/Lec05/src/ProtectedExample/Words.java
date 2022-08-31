/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProtectedExample;

/**
 *
 * @author HP
 */
public class Words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dictionary webster = new Dictionary();
        System.out.println("Number of pages: "
                + webster.getPages());
        System.out.println("Number of definitions: "
                + webster.getDefinitions());
        System.out.println("Definitions per page: "
                + webster.computeRatio());
    }
    
}

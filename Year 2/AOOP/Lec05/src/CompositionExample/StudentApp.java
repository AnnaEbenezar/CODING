/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompositionExample;

/**
 *
 * @author HP
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address school = new Address("800 Lancaster Ave.", "Villanova",
                "PA", 19085);
        Address jHome = new Address("21 Jump Street", "Lynchburg",
                "VA", 24551);
        Student john = new Student("John", "Smith", jHome, school);
        Address mHome = new Address("123 Main Street", "Euclid", "OH",
                44132);
        Student marsha = new Student("Marsha", "Jones", mHome, school);
        System.out.println(john);
        System.out.println();
        System.out.println(marsha);

    }

}

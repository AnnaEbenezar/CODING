/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SortingExample;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class PhoneList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contact[] friends = new Contact[8];
        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Getz", "663-555-3984");
        friends[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact("Mario", "Guzman", "804-555-9066");
        friends[7] = new Contact("Marsha", "Grant", "243-555-2837");

//        Sorting.selectionSort(friends);
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
//        Arrays.sort(friends);
        Arrays.sort(friends, new FirstNameComparator());
        System.out.println();
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
        Arrays.sort(friends, new PhoneNumComparator());
        System.out.println();
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }

    }

}

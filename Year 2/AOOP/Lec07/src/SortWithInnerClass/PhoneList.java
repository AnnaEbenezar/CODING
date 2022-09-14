/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortWithInnerClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class PhoneList {

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

        System.out.println("List of Friends: ");
        for (Contact c : friends) {
            System.out.println(c);
        }

        //Sort friends on first name and show the list 
        Arrays.sort(friends, new FirstNameComparator());
        System.out.println("List of Friends sorted by First Name : ");
        for (Contact c : friends) {
            System.out.println(c);
        }

        //Sort friends on last name and show the list
        Arrays.sort(friends, new Contact.LastNameComparator());
        System.out.println("List of Friends sorted by Last Name : ");
        for (Contact c : friends) {
            System.out.println(c);
        }

        //Sort friends on phone no and show the list
        Arrays.sort(friends, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Contact) o1).getPhone().compareTo(((Contact) o2).getPhone());
            }
        });
        
        /* Without type casting
        Arrays.sort(friends, new Comparaor<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });        
        */
        
        System.out.println("List of Friends sorted by Phone Number : ");
        for (Contact c : friends) {
            System.out.println(c);
        }
        
    }
}

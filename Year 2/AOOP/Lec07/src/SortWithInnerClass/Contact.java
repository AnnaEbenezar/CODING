/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortWithInnerClass;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class Contact {

    private String firstName, lastName, phone;

    public Contact(String first, String last, String telephone) {
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + '}';
    }
    
    public static class LastNameComparator implements Comparator<Contact> {

        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.lastName.compareTo(o2.lastName);
        }
        
    }
    
}

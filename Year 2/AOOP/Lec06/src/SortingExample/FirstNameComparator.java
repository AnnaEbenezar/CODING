/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingExample;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class FirstNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Contact)o1).getFirstName().compareTo(((Contact)o2).getFirstName());
    }
}

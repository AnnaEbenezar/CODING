/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class CatalogAppSortedByAuthor {
    public static void main(String[] args) {

        //Create an ArrayList of CatalogItems named list1
        //This ArrayList must take a type parameter of CatalogItem
        //CatalogItem in turn should take a type parameter CD
        ArrayList list1 = new ArrayList<CatalogItem>();

        //adding CatalogItems	
        list1.add(new CatalogItem<CD>(new CD(0, "Lady Gaga", "The Fame", 2008)));
        list1.add(new CatalogItem<CD>(new CD(7, "Lady Gaga", "The Fame Monster", 2009)));
        list1.add(new CatalogItem<CD>(new CD(5, "Jay-Z", "The Blueprint 3", 2009)));
        list1.add(new CatalogItem<CD>(new CD(2, "Santana", "Supernatural", 1999)));

        //printing the iPod catalog before and after sorting
        System.out.println("CD Catalog:");
        System.out.println("Before Sorting:");
        //show list1 using Iterator;
        System.out.println(list1);

        //sort list1 by ID;
        Collections.sort(list1);
        System.out.println("\nAfter Sorting by ID:");
        //show list1 using Iterator;
        System.out.println(list1);

        //Create an ArrayList of CatalogItems named list2
        //This ArrayList must take a type parameter of CatalogItem
        //CatalogItem in turn should take a type parameter Book
        ArrayList list2 = new ArrayList<CatalogItem>();

        //adding CatalogItems
        list2.add(new CatalogItem<Book>(new Book("B5", " Atlas Shrugged ", " Ayn Rand ", 1957)));
        list2.add(new CatalogItem<Book>(new Book("A0", " Lord of the Rings: Fellowship of the Ring ", " J.R.R. Tolkien ", 1954)));
        list2.add(new CatalogItem<Book>(new Book("C2", " Even Cowgirls Get the Blues ", " Tom Robbins ", 1976)));
        list2.add(new CatalogItem<Book>(new Book("A1", " The Subtle Knife ", " Philip Pullman ", 1997)));

        //printing the kindle catalog before and after sorting
        System.out.println("\n\nBook Catalog:");
        System.out.println("Before Sorting:");
        //show list2 using Iterator;
        System.out.println(list2);

        //sort list2 by ID;
        Collections.sort(list2);
        System.out.println("\nAfter Sorting by ID:");
        //show list2 using Iterator;
        System.out.println(list2);
        
        //sort list2 by Author;
        Collections.sort(list2, new CreatorComparator());
        System.out.println("\nAfter Sorting by Creator:");
        //show list2 using Iterator;
        System.out.println(list2);
    }
}

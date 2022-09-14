/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IteratorDesign;

import java.util.Iterator;

/**
 *
 * @author HP
 */
public class MyListApp {

    public static void main(String[] args) {
        String[] s = {"one", "two", "three", "four"};
        MyList aList = new MyList(s);
        Iterator it = aList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

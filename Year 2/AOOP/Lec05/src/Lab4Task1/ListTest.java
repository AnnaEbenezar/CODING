/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4Task1;

/**
 *
 * @author HP
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println("My List:\n" + myList);
        SortedIntList mySortedList = new SortedIntList(10);
        mySortedList.add(100);
        mySortedList.add(50);
        mySortedList.add(200);
        mySortedList.add(25);
        System.out.println("My Sorted List:\n" + mySortedList);

    }
    
}

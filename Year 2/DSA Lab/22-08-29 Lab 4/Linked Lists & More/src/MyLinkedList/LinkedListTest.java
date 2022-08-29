/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MyLinkedList;

/**
 *
 * @author HP
 */
public class LinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList mList = new MyLinkedList();
        
        mList.add(9);
        mList.add(7);
        mList.add(6);
        mList.add(2);
        
        System.out.println(mList.toString());
        
        mList.insert(5);    
                
        System.out.println(mList.toString());
        
        mList.delete(2);
        
        System.out.println(mList.toString());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FindTheMiddle;

/**
 *
 * @author HP
 */
public class Num6 {
    
    public class Node {

        public int val;
        public Node next;        
    }

    public Node head = null;
    
    //count the number of nodes
    public int count(Node head) {
        Node p = head;
        int k =1;
        while (p!=null) {
            p = p.next;
            k++;
        }
        return k;
    }
    
}

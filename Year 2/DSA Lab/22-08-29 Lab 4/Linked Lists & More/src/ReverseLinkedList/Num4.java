/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReverseLinkedList;

/**
 *
 * @author HP
 */
public class Num4 {
    
    public Node head;
    
    public class Node {
        public int data;
        public Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }
    
    //Function to reverse the linked list
    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    
    void printList(Node node) {
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReverseLinkedList;

/**
 *
 * @author HP
 */
class Num4Test {

    
    static Node head;
    
    static class Node {
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
    
    public void printList(Node node) {
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        Num4Test list = new Num4Test();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLinkedList;

/**
 *
 * @author HP
 */
public class MyLinkedList {

    public class Node {

        public int data;
        public Node next;
        public Node(int _data) {
            data = _data;
        }
    }

    public Node head = null;

    public void add(int data) {
        Node p = new Node(data);
        p.next = head;
        head = p;
    }

    public void insert(int d) {
        //*
        Node temp = new Node(d - 1);
        temp.next = head;
        Node p = temp;
        while (p.next != null && p.next.data < d) {
            p = p.next;
        }
        Node q = new Node(d);
        q.next = p.next;
        p.next = q;
        head = temp.next;
    }
        
        /*/
        if (head == null) {
            head = new Node(d);
            return;
        }
        if(head.data>d) {
            Node q = new Node(d);
            q.next = head;
            head = q;            
        } else {
            Node p = head;
            while(p.next!=null && p.next.data < d) {
                p = p.next;
            }
            Node q = new Node(d);
            q.next = p.next;
            p.next = q;
        }
        //*/
    
    public Node find(int d) {
        Node p = head;
        while( p != null) {
            if(p.data==d) return p;
            p = p.next;
        }
        return p;
    }
    
    public void delete(int d) {
        Node t = new Node(0);
        t.next = head;
        Node p = t;
        while ( (p.next != null) && (p.next.data != d)) {
            p = p.next;
        }
        if (p.next != null) {
            p.next = p.next.next;
        }
        head = t.next;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer("head");
        Node p = head;
        while (p != null) {
            sb.append("-->[");
            sb.append(p.data);
            sb.append("] ");
            p = p.next;
        }
        
        sb.append("-->null");
        return new String(sb);
    }
     
}

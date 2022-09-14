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
public class MyList implements Iterable {

    Object[] a;
    int size;

    public MyList(Object[] a) {
        this.a = a;
        this.size = a.length;
    }

    public Iterator iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        private int pos = 0;

        public boolean hasNext() {
            return pos < size;
        }

        public Object next() {
            return a[pos++];
        }

        public void remove() {
        }
    }
}

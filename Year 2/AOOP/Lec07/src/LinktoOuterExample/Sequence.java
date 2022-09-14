/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinktoOuterExample;

/**
 *
 * @author HP
 */
public class Sequence {

    private Object[] objects;
    private int next = 0;

    public Sequence(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next++] = x;
        }
    }

    private class SSelector implements Selector {

        private int i = 0;

        public boolean end() {
            return i == objects.length;
        }

        public Object current() {
            return objects[i];
        }

        public void next() {
            if (i < objects.length) {
                i++;
            }
        }
    }

    public Selector getSelector() {
        return new SSelector();
    }
}

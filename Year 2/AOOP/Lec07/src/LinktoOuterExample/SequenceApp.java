/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinktoOuterExample;

/**
 *
 * @author HP
 */
public class SequenceApp {

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

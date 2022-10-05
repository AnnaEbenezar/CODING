/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowDemo;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author HP
 */
class FlowDemo extends JFrame {

    JPanel jp = new JPanel(new FlowLayout());
    JButton b1 = new JButton("Button One");
    JButton b2 = new JButton("Button Two");
    JButton b3 = new JButton("Button Three");
    JButton b4 = new JButton("Button Four");
    JButton b5 = new JButton("Button Five");
    JButton b6 = new JButton("Button Six");

    FlowDemo() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(jp);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(b4);
        jp.add(b5);
        jp.add(b6);

        setVisible(true);
    }
}

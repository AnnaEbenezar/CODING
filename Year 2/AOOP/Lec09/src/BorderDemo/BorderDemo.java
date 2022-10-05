/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BorderDemo;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author HP
 */
class BorderDemo extends JFrame {

    JPanel jp = new JPanel(new BorderLayout());
    JButton b1 = new JButton("Button One");
    JButton b2 = new JButton("Button Two");
    JButton b3 = new JButton("Button Three");
    JButton b4 = new JButton("Button Four");
    JButton b5 = new JButton("Button Five");

    BorderDemo() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(jp);
        jp.add(b1, BorderLayout.CENTER);
        jp.add(b2, BorderLayout.NORTH);
        jp.add(b3, BorderLayout.SOUTH);
        jp.add(b4, BorderLayout.EAST);
        jp.add(b5, BorderLayout.WEST);

        setVisible(true);
    }
}

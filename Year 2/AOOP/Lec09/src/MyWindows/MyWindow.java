/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyWindows;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class MyWindow {

    JFrame jf = new JFrame("MyWindow");
    JMenuBar jmb = new JMenuBar();
    JMenu jm = new JMenu("File");
    JMenuItem jmi = new JMenuItem("Print Something Cute");
    JPanel jp = new JPanel();
    JTextField jtf = new JTextField("Try the File Menu");
    int count = 0;

    class DoIt implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Print Something Cute");
            jtf.setText("Count = " + ++count);

        }
    }

    public MyWindow() {
        jf.setSize(500, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setJMenuBar(jmb);
        jmb.add(jm);
        jm.add(jmi);
        jmi.addActionListener(new DoIt());

        jf.getContentPane().add(jp);
        jp.add(jtf);

        jf.setVisible(true);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09;

import javax.swing.*;

/**
 *
 * @author HP
 */
class BasicJFrame {

    public static void main(String[] args) {
        JFrame jf = new JFrame("The Basic JFrame");
        jf.setSize(250, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        JPanel jp = new JPanel();
        jf.getContentPane().add(jp);

        jf.setVisible(true);

    }
}

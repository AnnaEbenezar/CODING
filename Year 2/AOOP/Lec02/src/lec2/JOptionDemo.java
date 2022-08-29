/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec2;

import javax.swing.JOptionPane;

public class JOptionDemo {

    public static void main(String[] args) {
        String fullName = " ";
        String strAge = " ";

        int age = 0;

        fullName = JOptionPane.showInputDialog(null, "Enter your full name: ");

        JOptionPane.showMessageDialog(null, "Your full name is " + fullName);

        strAge = JOptionPane.showInputDialog(null, " Enter your age: ");

        age = Integer.parseInt(strAge);

        JOptionPane.showConfirmDialog(null, age, "Is this your real age?",
                JOptionPane.OK_CANCEL_OPTION);

        JOptionPane.showMessageDialog(null, "Your age is " + age + ".");
    }
}

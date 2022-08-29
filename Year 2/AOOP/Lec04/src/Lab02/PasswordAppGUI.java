/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PasswordAppGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = JOptionPane.showInputDialog(null, "Enter a password");
        
        while (!PasswordVerifier.isValid(str)) {
            JOptionPane.showMessageDialog(null, "Invalid password, Try Again.");
            str = JOptionPane.showInputDialog(null, "Enter a password");
        }
        
        JOptionPane.showMessageDialog(null, "Valid Pasword");
    }
    
}

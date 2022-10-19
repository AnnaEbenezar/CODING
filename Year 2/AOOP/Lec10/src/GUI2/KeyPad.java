/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI2;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class KeyPad extends JPanel implements ActionListener {

    private final static int NBUTTONS = 12;
    private KeyPadClient kpc;    // Owner of the KeyPad
    private JButton buttons[];   // An array of buttons
    private String labels[]
            = // And their labels
                {"1", "2", "3",
                "4", "5", "6",
                "7", "8", "9",
                "C", "0", "."};

//    public KeyPad(KeyPadClient kpc) {
//        this.kpc = kpc;
//        buttons = new JButton[NBUTTONS];      // Create the array
//        for (int k = 0; k < buttons.length; k++) { // For each button
//            buttons[k] = new JButton(labels[k]);  // Create it w/label
//            buttons[k].addActionListener(this);   // and a listener
//            add(buttons[k]);                      // and add to panel
//        } // for
//    }
    
    public KeyPad(KeyPadClient kpc) {
        setLayout(new GridLayout(4, 3, 1, 1));//1 space between each row and column
        this.kpc = kpc;
        buttons = new JButton[NBUTTONS];      // Create the array
        for (int k = 0; k < buttons.length; k++) { // For each button
            buttons[k] = new JButton(labels[k]);  // Create it w/label
            buttons[k].addActionListener(this);   // and a listener
            add(buttons[k]);                      // and add to panel
        } // for
    }


    public void actionPerformed(ActionEvent e) {
        String keylabel = ((JButton) e.getSource()).getText();
        kpc.keypressCallback(keylabel);
    }
}

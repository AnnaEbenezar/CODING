/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Converter extends JFrame implements ActionListener {

    private JLabel prompt = new JLabel("Distance in miles: ");
    private JTextField input = new JTextField(6);
    private JTextArea display = new JTextArea(10, 20);
    private JButton convert = new JButton("Convert!");

    public Converter() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(prompt);
        getContentPane().add(input);
        getContentPane().add(convert);
        getContentPane().add(display);
        display.setLineWrap(true);
        display.setEditable(false);
        convert.addActionListener(this);
    } // Converter()

    @Override
    public void actionPerformed(ActionEvent e) {
        double miles
                = Double.valueOf(input.getText()).doubleValue();
        double km = MetricConverter.milesToKm(miles);
        display.append(miles + " miles equals " + km
                + " kilometers\n");
    } // actionPerformed()
    
    public static void main(String args[]) {
        Converter f = new Converter();
        f.setSize(400, 300);
        f.setVisible(true);
        // Quit the application
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    } // main()

} // Converter


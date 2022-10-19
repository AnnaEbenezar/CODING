/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI2;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Converter extends JFrame implements ActionListener, KeyPadClient {

    private JLabel prompt = new JLabel("Distance in miles: ");
    private JTextField input = new JTextField(6);
    private JTextArea display = new JTextArea(10, 20);
    private JButton convert = new JButton("Convert!");
    private KeyPad keypad = new KeyPad(this);

    public Converter() {
        getContentPane().setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();         // Input panel
        inputPanel.add(prompt);
        inputPanel.add(input);
        getContentPane().add(inputPanel, BorderLayout.NORTH);

        JPanel controlPanel = new JPanel(new BorderLayout());// Controls
        controlPanel.add(keypad, BorderLayout.CENTER);
        controlPanel.add(convert, BorderLayout.SOUTH);
        getContentPane().add(controlPanel, BorderLayout.EAST);

        getContentPane().add(display, BorderLayout.CENTER);  // Output display
        display.setLineWrap(true);
        display.setEditable(false);
        convert.addActionListener(this);
        input.addActionListener(this);
    } // Converter()


    public void actionPerformed(ActionEvent e) {
        double miles = Double.valueOf(input.getText()).doubleValue();
        double km = MetricConverter.milesToKm(miles);
        display.append(miles + " miles equals " + km + " kilometers\n");
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

    @Override
    public void keypressCallback(String s) {
        if (s.equals("C")) {
            input.setText("");  // Clear the input
        } else {
            input.setText(input.getText() + s); // Type the key
        }
        
    }    
    
} // Converter

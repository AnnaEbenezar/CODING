/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisplayEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
class DisplayEvents extends JFrame {

    JPanel jp = new JPanel(new BorderLayout());
    JTextArea ta = new JTextArea();
    JScrollPane jsp = new JScrollPane(ta);
    JButton jb = new JButton("The Button");

    class ML implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            ta.append("mouseClicked - " + e.paramString() + "\n");
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }
    }

    
    DisplayEvents() {
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(jp);
        ta.setFont(new Font("SansSerif", Font.PLAIN, 18));
        jb.setFont(new Font("SansSerif", Font.PLAIN, 18));
        jp.add(jsp, BorderLayout.CENTER);
        jp.add(jb, BorderLayout.SOUTH);
        jb.setBackground(Color.yellow);
        
        jb.addMouseListener(new ML());

        setVisible(true);
    }
}

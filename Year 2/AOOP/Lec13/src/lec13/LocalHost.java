/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec13;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */
public class LocalHost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host = "localhost"; //try “loopback”
        for (int i = 100; i < 200; i++) {
            try {
                Socket s = new Socket(host, i);
                System.out.println("There is a server on port :" + i + "  of:  " + host);
            } catch (UnknownHostException e) {
                System.err.println(e);
            } catch (IOException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec13;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hostname = "www.ic.kmitl.ac.th";
        try {

            InetAddress a = InetAddress.getByName(hostname);

            System.out.println(hostname + ":" + a.getHostAddress());

        } catch (UnknownHostException e) {

            System.out.println("No address found for " + hostname);

        }
    }
    
}

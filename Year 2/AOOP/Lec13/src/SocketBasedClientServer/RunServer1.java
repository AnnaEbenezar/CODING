/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketBasedClientServer;

/**
 *
 * @author HP
 */
public class RunServer1 {

    public static void main(String args[]) {
        int port = 6789;
        Server1 server = new Server1(port);
        server.startServer();
    }
}

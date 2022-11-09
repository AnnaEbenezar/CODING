/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketBasedClientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class Server1 {

    ServerSocket echoServer = null;
    Socket clientSocket = null;
    int port;

    public Server1(int port) {
        this.port = port;
    }

    public void stopServer() {
        System.out.println("Server cleaning up.");
        System.exit(0);
    }

    public void startServer() {
        // Try to open a server socket on the given port
        // Note that we can't choose a port less than 1024 if we are not
        // privileged users (root)

        try {
            echoServer = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Waiting for connections. Only one connection is allowed.");
        while (true) {
            try {
                clientSocket = echoServer.accept();
                Server1Connection oneconnection = new Server1Connection(clientSocket, this);
                //oneconnection.run();new Thread(oneconnection).start();
                new Thread(oneconnection).start();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

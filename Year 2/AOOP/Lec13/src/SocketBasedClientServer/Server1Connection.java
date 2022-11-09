/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketBasedClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author HP
 */
class Server1Connection implements Runnable {

    BufferedReader is;
    PrintStream os;
    Socket clientSocket;
    Server1 server;

    public Server1Connection(Socket clientSocket, Server1 server) {
        this.clientSocket = clientSocket;
        this.server = server;
        System.out.println("Connection established with: " + clientSocket);
        try {
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            os = new PrintStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void run() {
        String line;
        try {
            boolean serverStop = false;
            while (true) {
                line = is.readLine();
                System.out.println("Received " + line);
                int n = Integer.parseInt(line);
                if (n == -1) {
                    serverStop = true;
                    break;
                }
                if (n == 0) {
                    break;
                }
                os.println("" + n * n);
            }
            System.out.println("Connection closed.");
            is.close();
            os.close();
            clientSocket.close();
            if (serverStop) {
                server.stopServer();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

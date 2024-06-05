package Exo3;

import java.io.*;
import java.net.*;

public class MulticastReceiver {

    static MulticastSocket socket;

    public static void main(String[] args) {
    
        try {
            InetAddress serverIP = InetAddress.getByName("224.0.0.1");
            int port = 8686;
            socket = new MulticastSocket(port);
            socket.joinGroup(serverIP);

            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverIP, port);

            System.out.println("Listening for multicast messages...");

            while (true) {
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

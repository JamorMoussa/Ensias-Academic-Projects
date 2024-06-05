package Exo1;

import java.io.*;
import java.net.*;

class ReceiverHandle implements Runnable{

    DatagramPacket packet;

    public ReceiverHandle(DatagramPacket packet){
        this.packet = packet;
    }

    @Override
    public void run(){

        String client_msg = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received msg: " + client_msg);

    }

}

public class Receiver {

    static int port = 7676;
    static DatagramSocket server;

    public static void main(String[] args){

        port = Integer.valueOf(args[0]);
        

        try{
            server = new DatagramSocket(port);
            while(true){
                System.out.println("The server is listening....");
                byte[] receiveData = new byte[1024];
                DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);

                server.receive(packet);

                ReceiverHandle r_handle = new ReceiverHandle(packet);

                new Thread(r_handle).start();

            }

        }catch(IOException e){

        }
    }
    
}

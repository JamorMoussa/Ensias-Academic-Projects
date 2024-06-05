package Exo1;

import java.io.*;
import java.net.*;

public class Sender{

	static DatagramSocket client;
	final static String serverIP = "127.0.0.1";
	final static int port = 7676; 

	public static void main(String[] args) throws UnknownHostException{

		InetAddress serverInetAdress = InetAddress.getByName(serverIP);

		try{

			client = new DatagramSocket();

			for(int i=0;i<10;i++){

				String msgToSend = "Hello evrery body ! " + i;

				byte[] msgToSendByte = msgToSend.getBytes();

				DatagramPacket sendPacket = new DatagramPacket(msgToSendByte, msgToSendByte.length, serverInetAdress, port);

				client.send(sendPacket);
			}


		}catch(IOException e){

		}


	}
}
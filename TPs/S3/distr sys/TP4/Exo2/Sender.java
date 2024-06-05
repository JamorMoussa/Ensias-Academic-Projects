package Exo2;

import java.io.*;
import java.net.*;
import java.util.Random;

public class Sender{

	static DatagramSocket client;
	final static String serverIP = "127.0.0.1";
	final static int port = 7676; 
	static Random random = new Random(); 

    static String[] proverbes = {
	    "Quand la pauvreté entre par la porte, l'amour s'en va par la fenêtre",
	    "On ne peut empêcher le chien d'aboyer, ni le menteur de mentir",
	    "Aime-toi et tu auras des amis",
	    "Un bon père de famille doit être partout, dernier couché premier debout",
	    "La douceur du miel ne console pas de la piqûre de l'abeille",
	    "Avec du temps et de la patience, on vient à bout de tout",
	    "Vieille amitié ne craint pas la rouille",
	    "Il n'y a pas de grenouille qui ne trouve son crapaud",
	    "Plus on désire une chose, plus elle se fait attendre",
	    "Celui qui sème l'injustice moissonne le malheur"
	};

	public static void main(String[] args) throws UnknownHostException{

		InetAddress serverInetAdress = InetAddress.getByName(serverIP);

		try{

			client = new DatagramSocket();

			for(int i=0;i<10;i++){

				String msgToSend = proverbes[random.nextInt(proverbes.length)];

				byte[] msgToSendByte = msgToSend.getBytes();

				DatagramPacket sendPacket = new DatagramPacket(msgToSendByte, msgToSendByte.length, serverInetAdress, port);

				client.send(sendPacket);
			}


		}catch(IOException e){

		}


	}
}
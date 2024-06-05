package Exo3;

import java.io.*;
import java.net.*;
import java.util.Random;


public class MulticastSender {

    static Random random = new Random();

    static String[] proverbs = {
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

    public static void main(String[] args) {
    
        try {
            InetAddress group = InetAddress.getByName("224.0.0.1");
            int port = 8686;
            MulticastSocket socket = new MulticastSocket();

            for(int i = 0;i<10;i++) {
                String randomProverb = proverbs[random.nextInt(proverbs.length)];
                byte[] message = randomProverb.getBytes();
                DatagramPacket packet = new DatagramPacket(message, message.length, group, port);
                socket.send(packet);
                System.out.println("Sent: " + randomProverb);
                Thread.sleep(100);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

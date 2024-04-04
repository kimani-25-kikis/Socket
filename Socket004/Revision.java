package Socket004;

import java.net.*;

public class Revision {
    public static void main(String[] args) {
        try {
            // Specify the destination IP address and port number
            InetAddress destAddress = InetAddress.getByName("127.0.0.1"); // Destination IP address
            int destPort = 12345; // Destination port number

            // Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();

            // Prepare the message to be sent
            String message = "Hello, UDP!";
            byte[] messageBytes = message.getBytes(); // Convert message to byte array

            // Construct a DatagramPacket with the message, destination address, and port
            DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length, destAddress, destPort);

            // Send the packet
            socket.send(packet);

            // Close the socket
            socket.close();

            System.out.println("Packet sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

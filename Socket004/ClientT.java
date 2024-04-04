package Socket004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientT {
    public static void main(String[] args) {
        int port = 1000;
        try{
            System.out.println("Establishing connection..");
            @SuppressWarnings("resource")
            Socket socket = new Socket(InetAddress.getLocalHost(), port);
            System.out.println("Connection established to server"+ InetAddress.getLocalHost());
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            @SuppressWarnings("unused")
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

            while (true) {
                String question= "What is the time?";
                System.out.println(question);

                String Answer = input.readLine();
                System.out.println(Answer);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

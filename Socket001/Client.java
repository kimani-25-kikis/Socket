package Socket001;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        int port = 3000;

        try{

            InetAddress address = InetAddress.getLocalHost();

            Socket socket = new Socket(address,port);

            System.out.println("Connected to server");

            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

            while (true) {
                String quiz = "What is your name";

                out.println(quiz);
            }

        }catch(Exception e){

            System.out.println(e.getMessage());
        }
    }
}

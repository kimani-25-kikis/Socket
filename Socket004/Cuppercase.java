package Socket004;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Cuppercase {
    public static void main(String[] args) {
        int Client_port = 2000;

        try{

            System.out.println("Establishing connection..");
            Socket socket = new Socket(InetAddress.getLocalHost(),Client_port);

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getOutputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

            while (true) {
                
            }
        }
    }
    
}

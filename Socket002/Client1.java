package Socket002;

import java.net.InetAddress;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) {
        int port = 5000;

        try{
            InetAddress address = InetAddress.getLocalHost();

            Socket socket = new Socket(address,port);

            System.out.println("Connected to server....");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

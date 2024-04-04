package Socket002;

import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        int port =5000;

        ServerSocket server = null;

        try{

            server = new ServerSocket(port);

            System.out.println("Server is running on port "+port);
             
            while (true) {
                Socket socket = server.accept();
                System.out.println("Connected to the client...");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if (server!=null) {
                    server.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

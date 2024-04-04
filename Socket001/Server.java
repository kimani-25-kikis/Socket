package Socket001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server{
    public static void main(String[] args){
        int port = 3000;

        ServerSocket server= null;

        try{
            server = new ServerSocket(port);
            System.out.println("Server running on port "+port);

            while (true) {
                Socket socket = server.accept();

                System.out.println("connected to client...");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

                String quiz = in.readLine();

                String answer;

                if(quiz.equals("What is your name")){
                   answer = "Kimani Kikis"; 
                }

            }
           

        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }finally{
            try{

                if(server!= null){
                    server.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
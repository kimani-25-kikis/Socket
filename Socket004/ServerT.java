package Socket004;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class ServerT {
   int Server_port =  1000;
   ServerSocket socket = null;

   try{

    System.out.println("Server running on port "+ Server_port);
    socket = new ServerSocket(Server_port);

    while (true) {
        Socket server = socket.accept();
        System.out.println("COnnected to client "+ server.getLocalAddress());

        BufferedReader input = new BufferedReader(new BufferedReader(server.getInputStream()));
        PrintWriter output = new PrintWriter(server.getOutputStream(), true);
        String question = input.readLine();

        if(question != null){
            String answer;
            if(question.equals("what is the time?")){
                Date date = new Date();
                answer= date.toString();
                System.out.println(answer);
            }
        }else{
            String answer;
            answer ="I dont Know";
        }
    }
   }catch(Exception e){
        System.out.println(e.getMessage());
   }finally{
    try{
        if(socket != null)
        socket.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
   }
}

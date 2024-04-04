package Socket003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class clentT {
    public static void main(String[] args) {
        Socket socket = null;

        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter =null;

    

    try{
        socket = new Socket("Localhost", 1000);

        inputStreamReader = new InputStreamReader(socket.getInputStream());

        outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        bufferedReader = new BufferedReader(inputStreamReader);
        bufferedWriter= new BufferedWriter(outputStreamWriter);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String msgTosend = scanner.nextLine();
            bufferedWriter.write(msgTosend);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            
            System.out.println("Server"+bufferedReader.readLine()); 
        }
    }catch(IOException e){
        e.printStackTrace();
    }finally{
        try{
            if(socket!= null)
            socket.close();
            if(bufferedReader != null)
            socket.close();
            if(bufferedWriter != null)
            socket.close();
            if(inputStreamReader !=null)
            socket.close();
            if(outputStreamWriter != null)
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
}

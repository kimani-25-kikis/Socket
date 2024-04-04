package Socket003;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Socket socket = null;

        InputStreamReader inputSreamReader = null;
        OutputStreamWriter outputStreamWriter= null;

        BufferedReader bufferedReader =null;
        BufferedWriter bufferedWriter= null;

        try{

            socket = new Socket("Localhost", 1234);
            inputSreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedReader = new BufferedReader(inputSreamReader);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                
                String msgtoSend = scanner.nextLine();
                bufferedWriter.write(msgtoSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println("Server" + bufferedReader.readLine()); 

                if(msgtoSend.equalsIgnoreCase("BYE"))
                break;
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(socket !=null)

                socket.close();

                if(bufferedReader != null)
                socket.close();
                if(bufferedWriter != null)
                socket.close();
                if(inputSreamReader !=null)
                socket.close();
                if(outputStreamWriter != null)
                socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
}

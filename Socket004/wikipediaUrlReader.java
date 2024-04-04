package Socket004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class wikipediaUrlReader {
    public static void main(String[] args) {
        String wikipediaURL = "https://en.wikipedia.org/wiki/Main_Page"; // Wikipedia URL

        try {
            // Create a URL object
            URL url = new URL(wikipediaURL);

            // Open a connection to the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // Read and display the content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


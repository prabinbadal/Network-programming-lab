package urlconnection;

import java.net.*;

public class urlconnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.facebook.com/");
            URLConnection connection = url.openConnection();
            
            // Optional: Set request properties (such as headers)
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            // Optional: Set timeout
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            
            // Optional: Enable output (for POST requests)
            connection.setDoOutput(true);
            connection.connect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


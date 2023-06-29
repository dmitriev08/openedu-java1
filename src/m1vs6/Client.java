package m1vs6;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client ready");
        int value = 0;
        try {
            Socket socket = new Socket("localhost", 8091);
            System.out.println("Client connected");
            InputStream is = socket.getInputStream();
            value = is.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Client read " + value);
    }
}

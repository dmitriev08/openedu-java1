package m1vs6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Bank {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8091);
            System.out.println("Server is ready");
            Socket socket = ss.accept();
            System.out.println("Server connected to client");
            OutputStream os = socket.getOutputStream();
            os.write(42);
            System.out.println("Server sent value 42");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
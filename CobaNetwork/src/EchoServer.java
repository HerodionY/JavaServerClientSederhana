import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("waiting for client...");
            ServerSocket ss = new ServerSocket(9806);
            Socket socket = ss.accept();
            System.out.println("Connection established!");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Echo Server : "+str);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

import java.io.*;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting up for Client...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int num = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Factorial of "+num+" is "+calculateFactorial(num));

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }

    static int calculateFactorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}

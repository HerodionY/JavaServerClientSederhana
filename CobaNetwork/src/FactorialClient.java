import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started");
            Socket soc = new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Factorial Number");
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter output = new PrintWriter(soc.getOutputStream(), true);
            output.println(number);
            BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(input.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}

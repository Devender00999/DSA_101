import java.io.*;
public class InputBufferReader {
    public static void main(String args[]) throws IOException{
        // Taking Input from Buffer Reader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Something");
        //Taking String as input 
        String val = input.readLine();
        System.out.println("You have Entered: "+val); 
        System.out.println("Enter a Number"); 
        int num = Integer.parseInt(input.readLine());
        System.out.println("You have Entered: "+num); 
    }
}

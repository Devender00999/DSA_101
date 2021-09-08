import java.io.*;

public class Program3 {
    // Program for Writing on a file
    public static void main(String args[]){
        try {
            FileWriter file = new FileWriter("myFile.txt");
            file.write("This is Writing on a file");
            file.close();
            System.out.println("Writing on file is Successfull");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

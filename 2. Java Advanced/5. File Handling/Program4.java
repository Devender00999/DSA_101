import java.io.*;
import java.util.Scanner;

public class Program4 {
    public  static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("text.txt"));
            System.out.println(in.nextLine());
        }
        catch(FileNotFoundException ex){
            System.out.println();
            ex.printStackTrace();
        }
        finally{
            System.out.println("I am inevitable");
        }
        
    }
}

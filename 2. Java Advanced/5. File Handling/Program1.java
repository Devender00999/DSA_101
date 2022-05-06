import java.io.*;
public class Program1 {
    // Program for Creating a file.
    public static void main(String str[]){
        try{
            File obj = new File("myFile.txt");
            if (obj.createNewFile()){
                System.out.println("File Created Successfully");
            }
            else{
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

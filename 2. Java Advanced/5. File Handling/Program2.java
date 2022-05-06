import java.io.File;

public class Program2 {
    public static void main(String args[]){
        // Program for Files Information
        File obj = new File("myFile.txt");
        if (obj.exists()){
            System.out.println("File Name: "+obj.getName());
            System.out.println("Absolute Path: "+obj.getAbsolutePath());
            System.out.println("Can Read?: "+obj.canRead());
            System.out.println("Can Write: "+obj.canWrite());
            System.out.println("Length: "+obj.length());
        }
    }
}

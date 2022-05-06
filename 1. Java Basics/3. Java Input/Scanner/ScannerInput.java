import java.util.Scanner;
public class ScannerInput {
    public static void main(String args[]){
        System.out.println("Enter something");
        Scanner input = new Scanner(System.in);
        String strVal = input.nextLine();
        System.out.println("You have entered: "+strVal);

        System.out.println("Enter Number");
        int intVal = input.nextInt();
        System.out.println("You have entered: "+intVal);
    }
}

import java.util.Scanner;

// Program for Exception handling
public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        try{
            System.out.println(a+" / "+b+" = "+a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

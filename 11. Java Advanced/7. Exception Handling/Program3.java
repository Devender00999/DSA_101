import java.util.Scanner;

// Handling Exception using throw and throws
public class Program3 {
    public static void main(String[] args) {
        try{
            methodA();
        }
        catch(ArithmeticException ex){
            ex.printStackTrace();
        }        
    }

    public static void methodA(){
        int a = 10, b = 0;
        Scanner input = new Scanner(System.in);
        b = input.nextInt();
        input.close();
        if (b==0) throw new ArithmeticException();
        int c = a/b;
        System.out.println(c);
    }
}

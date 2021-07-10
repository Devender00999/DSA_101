import java.util.Scanner;

public class Program {
    static String decimalToBinary(int num){
        String binary = "";
        if (num == 0) return "0";
        while(num > 0){
            binary = (num % 2)+binary;
            num /= 2;
        }
        return binary;
        
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.format("Binary of %d is %s\n", num, decimalToBinary(num));
        input.close();

    }
}

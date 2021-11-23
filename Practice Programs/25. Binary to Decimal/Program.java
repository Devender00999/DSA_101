import java.util.Scanner;

public class Program {
    // function to convert decimal to binary
    static int decimalToBinary(String binary){
        int pow = binary.length() - 1,pos = 0,decimal = 0;
        while(pos <= binary.length() - 1){
            decimal += (int)Math.pow(2,pow) * Integer.parseInt(binary.charAt(pos)+"");
            pos++;
            pow--;
        }
        return decimal;
        
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number in Binary: ");
        String binary = input.nextLine();
        System.out.format("Binary of %s is %d\n", binary, decimalToBinary(binary));
        input.close();

    }
}

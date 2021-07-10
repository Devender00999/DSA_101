import java.util.Scanner;

public class Program {
    // This program will print number after decimal point
    static void afterDecimal(String numString, String pattern) {
        int pos = numString.indexOf(".");
        if (pos == -1)
        {
            System.out.println("Invalid Decimal Number");
            return;
        }
        System.out.println("Number after decimal are: "+numString.substring(pos+1));

    }

   
    public static void main(String args[]) {
        System.out.println("Pattern Searching Problem");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        String numString = input.nextLine();

        afterDecimal(numString, ".");
        input.close();

    }
}

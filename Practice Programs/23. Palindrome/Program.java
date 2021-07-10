import java.util.Scanner;

public class Program {
    static String reverseString(String text) {
        String str = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            str += text.charAt(i);
        }
        return str;

    }
    public static void main(String args[]) {
        System.out.println("Pattern Searching Problem");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine();
        input.close();
        System.out.println("Reverse of "+text+" is "+reverseString(text));

    }
}

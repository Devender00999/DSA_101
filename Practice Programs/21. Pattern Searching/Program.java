import java.util.Scanner;

public class Program {
    static void patternMatching(String text, String pattern) {
        int pos = text.indexOf(pattern, 0);
        if (pos == -1) {
            System.out.println("Pattern Not Found");
            return;
        }
        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = text.indexOf(pattern, pos + 1);
        }
        System.out.println();

    }

    static void patternMatching2(String text, String pattern) {
        int i = 0, index = -1;
        while (i < text.length() - pattern.length()+1) {
            index = text.indexOf(pattern, i);
            if (index == -1) {
                System.out.println("Pattern Not Found");
                break;
            }
            System.out.print(index + " ");
            i = index + 1;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        System.out.println("Pattern Searching Problem");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine();

        System.out.println("Enter pattern to find in text");
        String pattern = input.nextLine();
        input.close();
        patternMatching(text, pattern);
        patternMatching2(text, pattern);

    }
}

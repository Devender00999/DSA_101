import java.util.Scanner;
public class NthTerm {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter d: ");
        int d = input.nextInt();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.printf("a = %d\td = %d\tn = %d\n",a, d, n);
        System.out.printf("%d term is: %d\n",n,a+(n-1)*d);
        input.close();
    }
}

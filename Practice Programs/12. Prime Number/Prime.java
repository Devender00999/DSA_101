import java.util.Scanner;
public class Prime {
    static boolean isPrime(int num){
        if (num == 1) return false;
        if(num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i*i <= num; i++)
            if (num % i == 0 || num % i+2 == 0)
                return false;
        return true;
    }
    public static void main(String args[]){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();
        System.out.println(isPrime(num) ? "Prime" : "Not Prime");
        
        input.close();
        // Sorted
    
        System.out.println();
    }
}

import java.util.Scanner;

public class PrimeFactors {
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int i = 2;
        System.out.print("Prime Factor of "+num+" are: ");

        while (num > 1){
            if (isPrime(i) && num % i == 0){
                System.out.print(i+" ");
                num /= i;
            }
            else{
                i++;
            }
        }
        System.out.println();

        input.close();

    }
}

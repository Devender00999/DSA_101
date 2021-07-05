import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String args[]){
        int largest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = input.nextInt();
        if (num1 >= num2 && num1 > num3)
            largest = num1;
        else if(num2>= num1 && num2 > num3)
            largest = num2;
        else
            largest = num3;
        System.out.printf("Largest among %d, %d, %d is %d\n",num1, num2, num3, largest);
        input.close();
    }
}

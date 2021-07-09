import java.util.Scanner;
public class SumOfArrays {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Creating Scanner Object for input
        int arr[], sum = 0, size;  //Declaring array and other variables
        System.out.print("Enter Size of Array: ");
        size = input.nextInt();
        arr = new int[size];
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt(); // Taking input and storing it in arr[i] 
        }
        
        for (int item: arr){ // Enhanced for loop for accessing elements of arr
            sum += item; 
        }
        System.out.println("Average of array is: "+sum);
        input.close();



    }
}

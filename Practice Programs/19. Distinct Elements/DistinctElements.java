import java.util.Scanner;
public class DistinctElements {
    static boolean isInList(int arr[], int endIndex, int elem){ // Checking if element is already in previous aray
        for (int i = 0; i < endIndex; i++)
        {
            if (elem == arr[i])
                return true;
        }
       return false;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Creating Scanner Object for input
        int arr[], distinctElements = 0, size;  //Declaring array and other variables
        System.out.print("Enter Size of Array: ");
        size = input.nextInt();
        arr = new int[size];
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt(); // Taking input and storing it in arr[i] 
        }
        
        for (int i = 0; i < arr.length; i++){ // Enhanced for loop for accessing elements of arr
            if(!isInList(arr,i,arr[i])){
                distinctElements += 1;
            }
        }
        System.out.println("Distinct Elements in array arr: "+distinctElements);
        input.close();

    }
}

// 10 10 20 20 30

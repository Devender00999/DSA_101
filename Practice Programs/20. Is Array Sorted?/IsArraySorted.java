import java.util.Scanner;
public class IsArraySorted {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arr[], max, size;
        boolean isSorted = true;
        System.out.print("Enter Size of Array: ");
        size = input.nextInt();
        arr = new int[size];
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Yes" : "No");
        input.close();


    }
}

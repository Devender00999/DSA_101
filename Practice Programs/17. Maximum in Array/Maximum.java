import java.util.Scanner;
public class Maximum {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arr[], max, size;
        System.out.print("Enter Size of Array: ");
        size = input.nextInt();
        arr = new int[size];
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        max = arr[0];
        for (int item: arr){
            if (item > max)
                max = item;
        }
        System.out.println("Maximum of array is: "+max);
        input.close();



    }
}

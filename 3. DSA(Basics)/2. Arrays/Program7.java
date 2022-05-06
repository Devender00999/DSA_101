// Reversing an array

// i/p: 10, 20, 0, 30, 0, 50
// o/p: 50, 0, 30, 0, 20, 10
public class Program7 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 0, 30, 0, 50};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int arr[]){
        int left = 0; 
        int right = arr.length - 1;
        while(left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}

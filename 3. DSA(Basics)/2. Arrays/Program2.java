// Largest Number
public class Program2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,14,5};
        System.out.println("Big Item: "+largest(arr));
    }
    // Checking if number is largest
    public static int largest(int arr[]){
        int big = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > big){
                big = arr[i];
            }
        }
        return big;
    }
}

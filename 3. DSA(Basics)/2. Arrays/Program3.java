// Is array sorted
public class Program3 {
    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,1,2};
        System.out.println(isSorted(arr) ? "Yes" : "No");
    }
    public static boolean isSorted(int arr[]){
        boolean sorted = true;
        for (int i = 1; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                sorted = false;
            }
        }
        return sorted;
    }
}

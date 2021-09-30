// Largest Number
public class Program4 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,5};
        System.out.println("Second Largest Item Index: "+secondLargestEff(arr));
    }
    // Checking if number is secondLargest
    public static int secondLargest(int arr[]){
        int largestNumber = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[largestNumber]){
                largestNumber = i;
            }
        }
        int secondLargestNumber = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[secondLargestNumber] && arr[i] < arr[largestNumber]){
                secondLargestNumber = i;
            }
        }
        return secondLargestNumber;
    }

    public static int secondLargestEff(int arr[]){
        int big = 0;
        int sbig = -1;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[big]){
                sbig = big;
                big = i;
            }
            else if (arr[i] < arr[big]){
                if (sbig ==-1 || arr[i] > arr[sbig] )
                    sbig = i;
            }
        }
        return sbig;
    }
}

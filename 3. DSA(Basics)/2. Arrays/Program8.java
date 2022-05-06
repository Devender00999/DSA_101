// Left rotate by one

// i/p: 1, 2, 3, 4, 5
// o/p: 2, 3, 4, 5, 1
public class Program8 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        leftRotateByOne(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void leftRotateByOne(int arr[]){
        int tmp = arr[0];
        int i;
        for (i = 1; i < arr.length; i++){
            arr[i-1] = arr[i]; 
        }
        arr[i-1] = tmp;
    }
}

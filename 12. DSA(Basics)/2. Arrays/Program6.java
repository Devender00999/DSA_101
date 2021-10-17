// Move all Zero to Right

// i/p: 10, 20, 0, 30, 0, 50
// o/p: 10, 20, 30, 50, 0, 0
public class Program6 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 0, 30, 0, 50};
        moveZerosToRight(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void moveZerosToRightNaive(int arr[]){
        for (int i = 0; i < arr.length -1 ; i++){
            if (arr[i] == 0){
                int j = i+1;
                while(j < arr.length){
                    if (arr[j] != 0){                
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                    j++;    

                }
            }
        }
    }

    public static void moveZerosToRight(int arr[]){
        int nSize = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] != 0){
                arr[nSize++] = arr[i];
            }            
        }
        for (int i = nSize; i < arr.length; i++){
            arr[i] = 0;
        }
    }
}

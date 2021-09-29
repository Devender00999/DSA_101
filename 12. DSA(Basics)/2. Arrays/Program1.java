// Operations in Java

class Program1{
    public static void main(String[] args) {
        int arr[] = new int[5], nSize = 3;
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        System.out.print(arr.length);
        System.out.println("Array Before insertion");
        for (int i = 0; i < nSize; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        newSize = insert(arr,3,2,5,1);
        System.out.println("Array after insertion");
        for (int i = 0; i < nSize; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }

    // insertion at a position
    public static int insert(int arr[], int n, int x, int cap, int pos){
        if (cap == n) return n;
        for (int i = n; i >= pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = x;
        return n+1;
    }
}
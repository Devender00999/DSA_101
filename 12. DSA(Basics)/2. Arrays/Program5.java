// Largest Number
public class Program5 {
    public static void main(String[] args) {
        int arr[] = {1, 1,1,1,1};
        int nSize = removeDuplicate(arr);
        for (int i = 0; i < nSize; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+nSize);

    }
    
    // 10,20,20,20,30,40
    // 10
    public static int removeDuplicateNaive(int arr[]){
        int tmpArr[] = new int[arr.length];
        tmpArr[0] = arr[0];
        int nSize = 1; 
        for (int i = 1; i < arr.length; i++){
            if(tmpArr[nSize-1] != arr[i]){
                tmpArr[nSize] = arr[i];
                nSize++;
            }
        }
        for (int i = 0; i < nSize; i++){
            arr[i] = tmpArr[i];
        }
        return nSize;
    }
    public static int removeDuplicate(int arr[]){
        int nSize = 1;
        for (int i = 1; i < arr.length; i++){
            if (arr[nSize-1] != arr[i]){
                arr[nSize] = arr[i];
                nSize++;
            }
        }
        return nSize;
    }
}

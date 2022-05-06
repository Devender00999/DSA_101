public class MultiDimensional {
    public static void main(String args[]){
        int m = 3;
        int [][]arr = new int[m][]; // declaration of multidimensional array in java 
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new int[i+1];
            for (int j = 0; j <= i; j++)
            {
                arr[i][j] = i;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

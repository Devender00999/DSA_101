import java.util.HashSet;
import java.util.Arrays;
public class Program {
    // No. of Distinct Elements
    public static void main(String[] args) {
        Integer arr[] = {1,2,5,6,5};
        Integer arr1[] = {1,2,5,6,5};
        System.out.println("No. of Distinct Element: "+countDistinctElements(arr));
        System.out.println("No. of Distinct Element: "+countDistinctElements(arr1));
    }
    public static int countDistinctElements(int arr[]){
        HashSet<Integer> hash= new HashSet<Integer>();        
        for (int num : arr){
            hash.add(num);
        }
        System.out.println(hash);
        return hash.size();
    }
    public static int countDistinctElements(Integer arr[]){
        HashSet<Integer> hash = new HashSet<>(Arrays.asList(arr));
        return hash.size();
    }
}

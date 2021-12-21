import java.util.HashSet;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class Program {
    // Program for printing frequency of distinct elements
    public static void main(String[] args) {
        int arr[] = {10,12,10,15,10,20,12,12};
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.print("\n");
        frequecyOfElements(arr);


    }
    public static void frequecyOfElements(int arr[]){
        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
        for (int num : arr){
            // if (hashMap.containsKey(num)){
            //     hashMap.put(num, hashMap.get(num)+1);
            // }
            // else{
            //     hashMap.put(num, 1);
            // }
            hashMap.put(num, hashMap.getOrDefault(x, 0));   
        }
        for (Map.Entry<Integer, Integer> item : hashMap.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
        
    }

    
    
}

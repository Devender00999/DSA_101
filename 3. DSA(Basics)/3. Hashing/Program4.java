import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Program4 {
    public static void main(String args[]){
        // Program for HashSet
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        //add method
        hash.put("one", 1);
        hash.put("two", 2);
        hash.put("one", 1);
        for (Map.Entry<String, Integer> item : hash.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
        System.out.println(hash);

        //contains method
        System.out.println("Contains key 'one' :"+hash.containsKey("one"));
        System.out.println("Contains value '1' :"+hash.containsValue(1));

        // size()
        System.out.println("size: "+hash.size());

        // remove(value)
        System.out.println("Deleting: "+hash.remove("one"));

        for (Map.Entry<String, Integer> item : hash.entrySet()){
            System.out.print(item.getKey()+": "+item.getValue());
        }
        System.out.println();
        
        // get(key)
        System.out.println("Value at key `two`: "+hash.get("key"));


        // clear() 
        hash.clear();
        System.out.println("Is Empty: "+ hash.isEmpty());

    }
    
}

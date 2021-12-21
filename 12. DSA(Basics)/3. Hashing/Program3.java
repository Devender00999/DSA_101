import java.util.HashSet;
import java.util.Iterator;
public class Program3 {
    public static void main(String args[]){
        // Program for HashSet
        HashSet<String> hash = new HashSet<String>();
        //add method
        hash.add("This ");
        hash.add("is ");
        hash.add("DSA101");
        System.out.println("Current HashSet is: ");
        for (String item: hash){
            System.out.print(item);
        }
        System.out.println();
        System.out.println(hash);

        //contains method
        System.out.println(hash.contains("DSA101"));

        // Iterator 
        Iterator<String> obj = hash.iterator();
        while (obj.hasNext()){
            System.out.print(obj.next());
        }
        System.out.println();

        // size()
        System.out.println(hash.size());

        // remove(value)
        System.out.println("Deleting: "+hash.remove("DSA101"));

        for (String item: hash){
            System.out.print(item);
        }
        
        // clear() 
        hash.clear();
        System.out.println("Is Empty: "+ hash.isEmpty());

    }
    
}

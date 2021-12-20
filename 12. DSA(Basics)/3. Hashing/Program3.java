import java.util.HashSet;
public class Program3 {
    public static void main(String args[]){
        HashSet<String> hash = new HashSet<String>();
        //add method
        hash.add("This ");
        hash.add("is ");
        hash.add("DSA101");
        for (String item: hash){
            System.out.print(item);
        }
        System.out.println();

        //contains method
        System.out.println(hash.contains("is "));
    }
    
}

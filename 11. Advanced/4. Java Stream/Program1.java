import java.lang.reflect.Array;
import java.util.Arrays;

public class Program1 {
    public static void main(String args[]){
        String arr[] = {"abc","cde","acd","aec","xyz"};
        Arrays.stream(arr)
        .filter(a->a.startsWith("a"))
        .filter(a->a.endsWith("c"))
        .forEach(System.out::println);
    }
}

import java.util.ArrayList;
import java.util.function.Consumer;
public class Program2{
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        Consumer<Integer> twice = n->System.out.println(n);

        numbers.forEach(twice);
    }
}
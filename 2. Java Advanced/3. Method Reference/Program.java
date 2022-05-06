import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String args[]){
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        // number.forEach(Program::printSquare);     

        int arr[] = {12,3,4,5,'a'};
        int sum = Arrays.stream(arr)
        .sum();
        System.out.println(sum);
    }

    public static void printSquare(Integer x){
        System.out.println(x*x);
    }
}

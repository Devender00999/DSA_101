import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction{
    String run  (String str);
}

public class Program3{
    public static void main(String args[]){
        StringFunction exclaim = str -> str+"!";
        StringFunction ask = str -> str +"?";
        printFormatted("Hello", exclaim);
        printFormatted("Anyone there", ask);
    }

    public static void printFormatted(String str, StringFunction format){
        System.out.println(format.run(str));
    }
}
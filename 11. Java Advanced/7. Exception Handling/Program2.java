// Handling Exception of calling function
public class Program2 {
    public static void main(String[] args) {
        try{
            methodA();
        }
        catch(FileNotFoundException ex){
            System.out.println();
            ex.printStackTrace();
        }        
    }

    public static void methodA(){
        int a = 10, b = 0;
        int c = a/b;
        System.out.println(c);

    }
}

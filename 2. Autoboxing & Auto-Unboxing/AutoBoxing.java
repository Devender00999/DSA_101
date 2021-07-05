public class AutoBoxing{
    public static void main(String args[]){
        int x1 = 15;
        Integer x2 = x1, x5 = 15; // Autoboxing
        int x3 = x2; // Autounboxing
        Integer x4 = 15;
        if (x2 == x5)
            System.out.println("Same");
        else{
            System.out.println("Not Same");
        }
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
    }
}
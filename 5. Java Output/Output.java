public class Output {
    public static void main(String args[]){
        int a = 15, b = 55;
        System.out.println(a); // Output 15 
        System.out.println("a + b = "+(a+b)); // Output 70
        System.out.print("Hello, "); // Use of print() doesn't add new line
        System.out.println("World");

        System.out.printf("a = %d, b = %d", a, b); // output a = 15, b = 55
        System.out.format("a = %d, b = %d", a, b); //same output a = 15, b = 55 with format
        System.out.println(); // Print new line
    }
}

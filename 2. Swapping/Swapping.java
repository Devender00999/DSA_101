class Swapping{
    public static void main(String args[]){
        int a = 10, b = 20;
        //swapping a and b
        System.out.println("Value of a & b before swapping: " + a + " " + b);
        int temp = a; // Temp variable for swapping
        a = b;
        b = temp; 
        System.out.println("Value of a & b after swapping : " + a + " " + b);
    }
}
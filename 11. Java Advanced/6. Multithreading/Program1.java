// Multi Threading using extending Thread class
class Test extends Thread{
    public void run(){
        System.out.println("Inside the Test Thread");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Test thread1 = new Test();
        thread1.start();
        System.out.println("Inside Main Method");
        
    }
}

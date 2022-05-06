// Multi Threading using extending Thread class
class Test implements Runnable{
    public void run(){
        for (var i=0;i<5;i++)
            System.out.println("Inside the Test Thread");
            
    }
}
public class Program2 {
    public static void main(String[] args) {
        try{
            Thread thread1 = new Thread(new Test());
            thread1.start();
            for (var i=0;i<5;i++)
            {    System.out.println("Inside Main Method");
                Thread.sleep(1);    
            }
            System.out.println(thread1.getState());
        }
        catch(InterruptedException ex){

        }
        
    }
}

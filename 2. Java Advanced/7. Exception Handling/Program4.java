// User Defined Exception

class InvalidBalanceException extends Exception{
    InvalidBalanceException(String message){
        super(message);
    }
}
public class Program4 {

    public static void main(String[] args) {
        int balance;
        try{
            balance = Integer.parseInt(args[0]);
            updateBalance(balance);
            System.out.println("Balance is "+balance);
        }
        catch(InvalidBalanceException ex){
            ex.printStackTrace();
            System.out.println("In Catch of InvalidBalanceException");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("In Catch of ArrayIndexOutOfBoundsException");
        }
        catch(Exception ex){
            System.out.println("In Catch of Exception");
        }

    }    
    static void updateBalance(int a) throws InvalidBalanceException{
        if (a < 0) throw new InvalidBalanceException("Balance Cannot be Negative");
    }
}

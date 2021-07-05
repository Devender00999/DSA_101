public class CommandLineArgument {
    public static void main(String[] args){ // args is array of command line arguments
        if (args.length > 0){
            System.out.print("Command Line Arguments are: \f"); 
            for (String arg : args){  // accessing each argument one by one
                System.out.println(arg);
            }
        }
    }
}

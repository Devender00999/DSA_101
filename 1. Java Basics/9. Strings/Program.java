
public class Program {
    public static void main(String args[])
    {
        // String using char
        char []a = {'H','e','y'};
        for (int i = 0; i < a.length; i++) //Printing Value of a(Character Array)
        {
            System.out.print(a[i]); 
        }
        System.out.println();

        // String using String class 
        String str = "Hello World";
        System.out.println(str);

        //String using StringBuffer
        StringBuffer str1 = new StringBuffer("Hi, Dev");
        System.out.println(str1);
        str1.append("ender");
        System.out.println(str1);

        //String using StringBuilder
        StringBuilder str2 = new StringBuilder("Hello World");
        System.out.println(str2);

        //Methods in String
        System.out.println("\n------------String Methods------------");
        System.out.println(str+".charAt(3): "+str.charAt(3));
        System.out.println(str+".indexOf(\"llo\"): "+str.indexOf("llo"));
        System.out.println(str+".length(): "+str.length());
        System.out.println(str+".contains(\"Hell\"): "+str.contains("Hell"));
        System.out.println(str+".equals(\"Hello World\"): "+str.equals("Hello World"));
        System.out.println(str+".lastIndexOf(\"l\"): "+str.lastIndexOf("l"));
        System.out.println(str+".substring(3): "+str.substring(3));
        System.out.println(str+".equalsIgnoreCase(\"hello world\"): "+str.equalsIgnoreCase("hello world"));
        System.out.println(str+".toUpperCase(\"hello world\"): "+str.toUpperCase());
        
        System.out.println("String and StringBuilder");
        String string1 = "geeks";
        String string2 = string1;

        string1 += "forgeeks";
        System.out.println(string1 == string2);

        StringBuffer string3 = new StringBuffer("geeks");
        StringBuffer string4 = string3;

        string3.append("forgeeks");
        System.out.println(string3 == string4);

        
    }    
}

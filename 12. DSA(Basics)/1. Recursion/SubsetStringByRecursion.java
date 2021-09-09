public class SubsetStringByRecursion {
    public static void printSubset(String str, String curr, int index){
        if (index == str.length()){
            System.out.print(curr+" ");
            return;
        }
        printSubset(str, curr, index+1);
        printSubset(str, curr+str.charAt(index), index+1);
    }

    public static void main(String[] args) {
        String str = "ABC";
        printSubset(str,"",0);
        System.out.println();
    }
}

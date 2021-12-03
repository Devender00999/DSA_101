import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++){
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(int key){
        int index = key % BUCKET;
        table.get(index).addLast(key);
    }
    boolean search(int key){
        int index = key % BUCKET;
        return table.get(index).contains(key);
    }
    void remove(int key){
        int index = key % BUCKET;
        table.get(index).remove(key);
    }
}
public class Program1{
    public static void main(String[] args) {
        MyHash hash = new MyHash(5);
        hash.insert(45);
        hash.insert(5);
        hash.insert(6);
        hash.insert(1);
        hash.insert(7);
        hash.insert(2);
        hash.insert(0);
        for (int i = 0; i < hash.table.size(); i++){
            for(int j=0; j < hash.table.get(i).size(); j++){
                System.out.print(hash.table.get(i).get(j)+"  ");
            }
            System.out.println();
        }
        System.out.println(hash.search(5) ? "Item found" : "Item not found");
    }
}
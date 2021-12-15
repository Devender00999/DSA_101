import java.util.ArrayList;

class MyHash{
    int cap;
    int size = 0;
    ArrayList<Integer> table = new ArrayList<Integer>();
    MyHash(int cap){
        this.cap = cap;
        for (int i = 0; i < this.cap; i++){
            table.add(-1);
        }
    } 

    int hash1(int key){
        return key % cap;
    }

    // void insert(int key){
    //     int hash = hash1(key);
    //     if (table.get(hash) == -1){
    //         table.set(hash, key);
    //     }
    //     else{
    //         int i = hash+1;
    //         while( i != hash){
    //             if (i == cap){ 
    //                 i =  i% cap;
    //             }
    //             if (table.get(i) == -1){
    //                 table.set(i, key);
    //             }
                
    //             i++;
    //         }
            
    //     }
    // }

    boolean insert(int key){
        if (size == cap) 
        return false;
        int i = hash1(key);
        while (table.get(i) != -1 && table.get(i) != -2 && table.get(i) != key )
            i = (i+1) % cap;
        if (table.get(i) == key){
            return false;
        }
        else{
            table.set(i,key);
            size++;
            return true;
        }
        
    }
    boolean delete(int key){
        if (size == 0){
            return false;
        }
        int hash = hash1(key);
        int i = hash;
        while(table.get(i) != -1 || table.get(i) != -2){
            if (table.get(i) == key){
                table.set(i,-2);
                size--;
                return true;
            }
            i = (i+1) % cap;
            if (i == hash){
                return false;
            }
        }
        return false;

    };
    boolean search(int key){
        int hash = hash1(key);
        int i = hash;
        while( table.get(i) != -1){
            if (table.get(i) == key){
                return true;
            }
            i = (i+1) % cap;
            if (i == cap -1){
                return false;
            }
        }
        return true;
    };

    void print(){
        for (int i = 0; i < cap; i++)
            System.out.print(table.get(i)+" ");
        System.out.println();
    }
}
public class Program2 {
    public static void main(String[] args) {
        MyHash hash = new MyHash(6);
        hash.insert(5);
        hash.insert(6);
        hash.insert(7);
        hash.insert(8);
        hash.insert(9);
        hash.insert(18);
        // System.out.println(hash.insert(18));
        // System.out.println(hash.insert(9));
        hash.print();
        System.out.println(hash.delete(9));
        System.out.println(hash.delete(18));
        hash.print();

        System.out.println(hash.search(18));
        hash.insert(18);
        hash.insert(9);

        hash.print();
    }
}

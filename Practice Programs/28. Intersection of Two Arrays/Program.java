import java.util.Arrays;
import java.util.HashSet;

public class Program {
    public static int countIntersections(int a[], int b[]) {
        int count = 0;
        HashSet<Integer> hashA = new HashSet<Integer>();
        HashSet<Integer> hashB = new HashSet<Integer>();
        for (int i : a) {
            hashA.add(i);
        }
        for (int i : b) {
            hashB.add(i);
        }

        for (Integer i : hashA) {
            if (hashB.contains(i)) {
                count++;
            }
        }
        return count;
    }

    // Efficient Solution
    public static int countIntersections2(int a[], int b[]) {
        int count = 0;
        HashSet<Integer> hashA = new HashSet<Integer>();
        for (int i : a) {
            hashA.add(i);
        }

        for (Integer i : b) {
            if (hashA.contains(i)) {
                count++;
                hashA.remove(i);
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // Count Intersection of two arrays
        int a[] = { 10, 10, 10, 20 };
        int b[] = { 10, 10, 10, 20 };
        int count = countIntersections(a, b);
        System.out.println(count);
    }
}

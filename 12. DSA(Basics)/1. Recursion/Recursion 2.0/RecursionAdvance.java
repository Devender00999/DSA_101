import java.util.ArrayList;

public class RecursionAdvance {
    // print all permutaion of a string
    public static void printPerm(String str, String permutaion) {
        if (str.length() == 0) {
            System.out.println(permutaion);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutaion + currChar);

        }
    }

    // count total path in a maze to move from (0, 0) to (n, m)
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move down
        int downMoves = countPath(i + 1, j, n, m);

        // move right
        int rightMoves = countPath(i, j + 1, n, m);

        return downMoves + rightMoves;
    }

    // Calculate no. of ways place tiles of 1xm in the floor of size of nxm.
    public static int calcPlaceTiles(int n, int m) {
        if (n < m) {
            return 1;
        }
        if (n == m) {
            return 2;
        }
        // place vertically
        int vertPlaced = calcPlaceTiles(n - m, m);

        // place horizontally
        int horPlaced = calcPlaceTiles(n - 1, m);

        return vertPlaced + horPlaced;
    }

    // no. of ways n guests can be invited as single or in pair
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // calling guests as single
        int way1 = callGuests(n - 1);

        // calling guests in pair of 2
        System.out.println(n - 1 + " " + (n - 2));
        int way2 = (n - 1) * callGuests(n - 2);

        // total ways in guests can be called
        return way1 + way2;
    }

    // printing all subset of first n natural numbers
    public static void findSubSet(int n, ArrayList<Integer> set) {
        if (n == 0) {
            for (int i = 0; i < set.size(); i++) {
                System.out.print(set.get(i) + " ");
            }
            System.out.println();
            return;
        }

        // choose to add
        set.add(n);
        findSubSet(n - 1, set);

        // choose to not add
        set.remove(set.size() - 1);
        findSubSet(n - 1, set);
    }

    public static void main(String[] args) {
        // print all permutation of a string
        // String str = "abc";
        // printPerm(str, "");

        // count total path in a maze to move from (0, 0) to (n, m)
        // int n = 4, m = 4;
        // int totalPaths = countPath(0, 0, n, m);
        // System.out.println(totalPaths);

        // Calculate no. of ways place tiles of 1xm in the floor of size of nxm.
        // int n = 5, m = 2;
        // int totalWays = calcPlaceTiles(n, m);
        // System.out.println(totalWays);

        // no. of ways n guests can be invited as single or in pair
        // int n = 4;
        // int totalWays = callGuests(n);
        // System.out.println(totalWays);

        // printing all subset of first n natural numbers
        int n = 3;
        ArrayList<Integer> set = new ArrayList<Integer>();
        findSubSet(n, set);
    }
}

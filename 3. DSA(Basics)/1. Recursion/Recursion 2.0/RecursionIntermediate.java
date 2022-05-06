import java.util.HashSet;

public class RecursionIntermediate {
    // tower of hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    // print reverse of a string
    public static void printReverseString(String s, int index) {
        if (index == 0) {
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        printReverseString(s, index - 1);
    }

    // finding first and last occurance of an element
    static int first = -1;
    static int last = -1;

    public static void findOccurance(String s, int idx, char element) {
        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (s.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
                last = idx;

            } else {
                last = idx;
            }
        }
        findOccurance(s, idx + 1, element);
    }

    // check if an array is sorted(Strictly Sorted)
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        return arr[idx] < arr[idx + 1] && isSorted(arr, idx + 1);
    }

    // move all 'x' to at the end of the string

    public static String moveAllX(String str, int i, String newStr, int count) {
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                newStr += 'x';
            }
            return newStr;
        }

        if (str.charAt(i) == 'x') {
            count += 1;
            return moveAllX(str, i + 1, newStr, count);
        }
        return moveAllX(str, i + 1, newStr + str.charAt(i), count);

    }

    // removing duplicates in a string
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a'] == false) {
            newStr += str.charAt(index);
            map[currentChar - 'a'] = true;
        }
        removeDuplicates(str, index + 1, newStr);
    }

    // print all subsequence of a string
    public static void subsequences(String str, int idx, String newStr) {
        if (str.length() == idx) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, newStr + currChar);
        // not to be
        subsequences(str, idx + 1, newStr);
    }

    public static void subsequences(String str, int idx, String newStr, HashSet<String> set) {
        if (str.length() == idx) {
            if (set.contains(newStr)) {
                return;
            }
            System.out.println(newStr);
            set.add(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, newStr + currChar, set);
        // not to be
        subsequences(str, idx + 1, newStr, set);
    }

    // print keypad combination
    public static String keyboard[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombination(String str, int idx, String combination) {
        if (str.length() == idx) {
            System.out.println(combination);
            return;
        }
        char currKey = str.charAt(idx);
        String map = keyboard[currKey - '0'];
        for (int i = 0; i < map.length(); i++) {
            printCombination(str, idx + 1, combination + keyboard[currKey - '0'].charAt(i));
        }
    }

    public static void main(String[] args) {
        // tower of hanoi
        // int n = 5;
        // towerOfHanoi(n, "S", "H", "D");

        // printing reverse of a string
        // String s = "abcd";
        // printReverseString(s, s.length() - 1);
        // System.out.println();

        // finding first and last occurance of an element
        // String s = "abaacdaefaah";
        // findOccurance(s, 0, 'b');

        // check if array is strictly sorted
        // int a[] = { 1, 2, 5, 2 };
        // boolean isSorted = isSorted(a, 0);
        // System.out.println(isSorted);

        // move all 'x' to end of the string
        // String str = "axbcxxd";
        // String newStr = moveAllX(str, 0, "", 0);
        // System.out.println(newStr);

        // removing duplicates in a string
        // String str = "aaaabbbbccccddddeee";
        // removeDuplicates(str, 0, "");

        // // print all subsequence of a string
        // String str = "abc";
        // subsequences(str, 0, "");

        // // print all unique subsequence of a string
        // String str = "aaa";
        // HashSet<String> set = new HashSet<String>();
        // subsequences(str, 0, "", set);

        // print keypad combination
        String keyPressed = "23";
        printCombination(keyPressed, 0, "");
    }
}

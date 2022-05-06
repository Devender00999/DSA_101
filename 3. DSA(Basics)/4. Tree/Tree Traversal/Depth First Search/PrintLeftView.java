import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class PrintLeftView {
    // Printing left view of tree
    static int max_level = 0;

    public static void printLeftView(Node root, int level) {
        if (root == null)
            return;
        if (max_level < level) {
            System.out.print(root.key + " ");
            max_level = level;
        }
        printLeftView(root.left, level + 1);
        printLeftView(root.right, level + 1);
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        printLeftView(root, 1);
        System.out.println();

    }

}

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

public class ChildernSum {
    // Verifying Children sum property
    // root.left + root.right == root for all tree
    public static boolean childrenSum(Node root) {
        if (root == null || (root.right == null && root.left == null))
            return true;
        int left = root.left != null ? root.left.key : 0;
        int right = root.right != null ? root.right.key : 0;
        return left + right == root.key && childrenSum(root.left) && childrenSum(root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(2);

        System.out.println(childrenSum(root));

    }

}

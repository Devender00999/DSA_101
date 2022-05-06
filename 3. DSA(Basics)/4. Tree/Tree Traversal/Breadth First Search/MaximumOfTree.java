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

public class MaximumOfTree {
    // Maximum element of tree
    public static int maxOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int max = root.key;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node curr = q.poll();
            if (curr.key > max) {
                max = curr.key;
            }
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        // tree
        // 10
        // / \
        // 20 30
        // / \ \
        // 40 50 70

        // output 70
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(60);
        root.right.right.left = new Node(80);
        System.out.println("Size of Tree: " + maxOfTree(root));

    }
}

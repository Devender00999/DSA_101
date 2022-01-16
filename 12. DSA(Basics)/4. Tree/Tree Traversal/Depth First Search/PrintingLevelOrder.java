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

public class PrintingLevelOrder {
    // Printing tree in level orders

    // Got an hint
    public static void printAtK(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.key + " ");
        }
        printAtK(root.left, k - 1);
        printAtK(root.right, k - 1);

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int rightHeight = height(root.right);
            int leftHeight = height(root.left);
            return (rightHeight > leftHeight ? rightHeight : leftHeight) + 1;
        }
    }

    public static void printLevel(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.key + " ");
            if (currentNode.left != null)
                queue.add(currentNode.left);
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String args[]) {
        // tree
        // 10
        // / \
        // 20 30
        // / \ \
        // 40 50 70

        // output 10 20 30 40 50 70
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        // printing in level order
        // for (int i = 0; i < height(root); i++) {
        // printAtK(root, i);
        // }
        printLevel(root);

        System.out.println();

    }
}

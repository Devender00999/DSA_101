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

    public static void printLeftView(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node currNode = queue.poll();
                if (i == 0)
                    System.out.print(currNode.key + " ");
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
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
        Node root = new Node(30);
        // root.left = new Node(20);
        // root.right = new Node(30);
        // root.left.left = new Node(40);
        // root.left.right = new Node(50);
        // root.right.right = new Node(70);

        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.left.right = new Node(10);

        printLeftView(root);
        System.out.println();

    }

}

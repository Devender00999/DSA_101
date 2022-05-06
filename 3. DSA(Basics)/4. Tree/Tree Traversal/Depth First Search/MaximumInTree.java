class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class MaximumInTree {
    // Maximum of tree using depth first search
    public static int maxOfTree(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Math.max(maxOfTree(root.left), maxOfTree(root.right));
        return Math.max(max, root.key);
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
        System.out.println("Maximum of Tree: " + maxOfTree(root));

    }
}

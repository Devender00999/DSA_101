class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class SizeOfTree {

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
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

        System.out.println("Size of Tree: " + size(root));

    }
}

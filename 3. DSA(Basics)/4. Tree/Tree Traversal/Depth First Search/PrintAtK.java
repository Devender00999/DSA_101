
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class PrintAtK {
    // Print node at k distance from root

    // My Solution
    // public static void printAtK (Node root, int i, int k){
    // if (root == null){
    // return;
    // }
    // else{
    // if (i == k){
    // System.out.println(root.key);
    // return;
    // }
    // printAtK(root.left,i+1, k);
    // printAtK(root.right,i+1,k);

    // }
    // }

    // Got an hint
    public static void printAtK(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.key);
        }
        printAtK(root.left, k - 1);
        printAtK(root.right, k - 1);

    }

    public static void main(String args[]) {
        // tree
        // 10
        // / \
        // 20 30
        // / \ \
        // 40 50 70
        // 2
        // output 40 50 70
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        // printing at k distance from node
        printAtK(root, 2);
        System.out.println();

    }
}

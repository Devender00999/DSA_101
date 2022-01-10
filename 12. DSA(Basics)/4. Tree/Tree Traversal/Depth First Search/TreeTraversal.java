
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
} 
public class TreeTraversal {   
    // in-order traversal of tree
    public static void inOrder (Node root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }

    // pre-order traversal of tree
    public static void preOrder (Node root){
        if (root != null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // post-order traversal of tree
    public static void postOrder (Node root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String args[]){
        // tree
        //      10
        //     /  \
        //    20  30
        //   /  \
        // 40   50
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // printing in-order
        System.out.print("Inorder:   ");
        inOrder(root);
        System.out.println();
        
        // printing pre-order
        System.out.print("Preorder:  ");
        preOrder(root);
        System.out.println();

        // printing post-order
        System.out.print("Postorder: ");
        postOrder(root);
        System.out.println();
    }
}

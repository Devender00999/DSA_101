
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
} 
public class HeightOfTree {   
    // post-order traversal of tree
    public static int height (Node root){
        if (root == null){
            return 0;
        }
        else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return (leftHeight > rightHeight ? leftHeight : rightHeight)+1;
        }
    }
    public static void main(String args[]){
        // tree
        //      10
        //     /  \
        //    20  30
        //   /  \
        // 40   50

        // output 
        // Height of tree is 3.
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // height of tree
        System.out.println("Height of tree is "+height(root)+".");
        
    }
}

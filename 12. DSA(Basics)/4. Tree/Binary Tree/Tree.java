class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
} 
public class Tree {   
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(5);
        root.right = new Node(56);
        System.out.print(root.key+" ");
        System.out.print(root.left.key+" ");
        System.out.println(root.right.key+" ");
    }
}

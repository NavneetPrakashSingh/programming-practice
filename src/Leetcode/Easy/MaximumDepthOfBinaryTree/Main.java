package Leetcode.Easy.MaximumDepthOfBinaryTree;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        BinaryTree treeObj = new BinaryTree();
        System.out.println(treeObj.maxDepth(root));

    }
}

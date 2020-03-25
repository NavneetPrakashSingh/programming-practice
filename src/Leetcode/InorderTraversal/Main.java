package Leetcode.InorderTraversal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node rootNode = new Node(1);
//        rootNode.right = new Node(2);
//        rootNode.right.left = new Node(3);
        rootNode.left = new Node(2);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(5);
        rootNode.right = new Node(3);
        rootNode.right.left = new Node(6);
        rootNode.right.right = new Node(7);

        Inorder inorderTraversal = new Inorder();
        List<Node> returningList = inorderTraversal.traversal(rootNode);
        for (int i = 0; i < returningList.size(); i++) {
            System.out.println(returningList.get(i).val);
        }
    }
}

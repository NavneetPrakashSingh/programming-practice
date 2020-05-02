package Medium.InorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Inorder {
    public List<Integer> inorder(Node root) {
        List<Integer> returningList = new LinkedList<>();
        if (root == null) {
            return returningList;
        }
        Stack<Node> stack = new Stack<>();
        Node currentElement = root;
        while (!stack.isEmpty() || currentElement != null) {
            if (currentElement != null) {
                stack.push(currentElement);
                currentElement = currentElement.left;
            } else {
                Node element = stack.pop();
                returningList.add(element.val);
                if (element.right != null) {
                    currentElement = element.right;
                }
            }
        }

        return returningList;
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
//        rootNode.right = new Node(2);
//        rootNode.right.left = new Node(3);
        rootNode.left = new Node(2);
        rootNode.left.left = new Node(4);
//        rootNode.left.right = new Node(5);
        rootNode.right = new Node(3);
//        rootNode.right.left = new Node(6);
//        rootNode.right.right = new Node(7);

        Inorder inorder = new Inorder();
        System.out.println(inorder.inorder(rootNode));

    }
}

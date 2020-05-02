package Medium.Preorder;


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

public class Preorder {
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

        Preorder preorder = new Preorder();
        System.out.println(preorder.preorder(rootNode));

    }

    private List<Integer> preorder(Node rootNode) {
        List<Integer> returningList = new LinkedList<>();
        if (rootNode == null) {
            return returningList;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(rootNode);
        while (!stack.isEmpty()){
            Node currentElement = stack.pop();
            returningList.add(currentElement.val);
            if(currentElement.right!=null){
                stack.push(currentElement.right);
            }
            if(currentElement.left!=null){
                stack.push(currentElement.left);
            }
        }
        return returningList;
    }
}

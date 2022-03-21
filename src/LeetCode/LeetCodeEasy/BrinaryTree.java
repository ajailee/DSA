package LeetCodeEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BrinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversal2(root));
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List list = new ArrayList<Integer>();
        travasal(root, list);
        return list;

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List list = new ArrayList<Integer>();
        travasalpre(root, list);
        return list;

    }

    public static List<Integer> inorderTraversal2(TreeNode root) {
        List list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {

            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            list.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return list;

    }

    public static List<Integer> prefixorderTraversal2(TreeNode root) {
        List list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {

            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            list.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return list;

    }

    static void travasal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        travasal(root.left, result);
        result.add(root.val);
        travasal(root.right, result);
    }

    static void travasalpre(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        travasal(root.left, result);
        travasal(root.right, result);
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return val + "";
    }
}

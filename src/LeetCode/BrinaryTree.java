package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BrinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List list = new ArrayList<Integer>();
        travasal(root, list);
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
}

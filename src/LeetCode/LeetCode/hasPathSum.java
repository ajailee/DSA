package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class hasPathSum {
    public static boolean flag = false;

    public static void main(String[] args) {
        Stack<TreeNode> list = new Stack<TreeNode>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int val = 0;
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        int target = 202;
        isSum(root, target, val);
        printPath(root, list, list2, val, target);
        System.out.println(flag);
    }

    static void printPath(TreeNode root, Stack<TreeNode> list, ArrayList<Integer> list2, int val, int target) {
        if (root == null) {
            return;
        }
        list.add(root);
        val = val + root.val;
        list2.add(root.val);
        if (root.left == null && root.right == null) {
            System.out.println(list.toString());
            System.out.println(list2.toString());
            System.out.println(val);
            if (val == target) {
                System.err.println("The path with target is" + list2.toString());
            }

        }
        printPath(root.left, list, list2, val, target);
        printPath(root.right, list, list2, val, target);
        list.pop();
        val = val - root.val;
        list2.remove(list2.size() - 1);
    }

    public static boolean isSum(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        int sum = target - root.val;
        if (sum == 0 && (root.left == null && root.right == null)) {
            return true;
        }
        return isSum(root.left, target) || isSum(root.right, target);

    }

}

package LeetCodeEasy;

public class MaximumDepthofBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        return Math.max(left, right);
    }

    public static int maxDepth1(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }

}

package LeetCode;

public class SymentricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public static boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return check(left.left, right.right) && check(left.right, right.left);
    }
}

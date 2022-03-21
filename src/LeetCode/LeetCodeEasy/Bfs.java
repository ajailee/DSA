package LeetCodeEasy;

// we need to print the node with same level
public class Bfs {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(12);
        System.out.println(root.val);
        bfs(root);
    }

    static void bfs(TreeNode root) {

        if (root == null) {
            return;
        }

        if (root.left != null)
            System.out.println(root.left.val);
        if (root.right != null)
            System.out.println(root.right.val);

        bfs(root.left);
        bfs(root.right);

    }

}

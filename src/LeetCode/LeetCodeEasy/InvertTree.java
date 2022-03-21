package LeetCodeEasy;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // System.out.println("Pre");
        // printTreePre(root);
        // System.out.println("\nPost");
        // printTreePost(root);
        System.out.println("\nInorder");
        printTreeIn(root);
        invert(root);
        System.out.println("\nInorder");
        printTreeIn(root);

    }

    static void invert(TreeNode root) {

        if (root.left == null || root.right == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    static void printTreePost(TreeNode root) {
        if (root == null) {
            return;
        }

        printTreePost(root.left);
        printTreePost(root.right);
        System.out.print(root.val + " ");
    }

    static void printTreeIn(TreeNode root) {
        if (root == null) {
            return;
        }

        printTreeIn(root.left);
        System.out.print(root.val + " ");
        printTreeIn(root.right);
    }

    static void printTreePre(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTreePre(root.left);
        printTreePre(root.right);
    }

}
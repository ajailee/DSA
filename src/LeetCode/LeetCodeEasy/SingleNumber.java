package LeetCodeEasy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 1, 3, 5 };
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result ^ a[i];
        }
        System.out.println(result);
    }
}

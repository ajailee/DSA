public class Kadanealgorithm {
    public static void main(String[] args) {
        int[] arr = { -10, -8, -3, -7, -2, -7, -3, -9 };
        int maxSoFar = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnd);
        }
        System.out.println(maxSoFar);
    }
}

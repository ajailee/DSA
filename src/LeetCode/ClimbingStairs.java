package LeetCode;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[2];
        dp[0] = 1;
        dp[0] = 1;

        while (n >= 0) {
            int curr = dp[0] + dp[1];
            dp[1] = dp[0];
            dp[0] = curr;
            n--;
        }
        return dp[0];

    }
}

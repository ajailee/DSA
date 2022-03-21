package LeetCodeEasy;

public class Fact {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(myrec(3, sum));
    }

    public static int myrec(int n, int sum) {

        if (n > 0) {
            sum = n + myrec(n - 1, sum);
        }
        return sum;
    }
}
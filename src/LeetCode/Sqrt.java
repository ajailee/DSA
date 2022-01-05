package LeetCode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {
        int count = 0;
        int odd = 1;
        while (x > 0) {
            count++;
            x = x - odd;
            odd = odd + 2;
            if (x < 0) {
                count--;
            }
        }
        return count;
    }
}

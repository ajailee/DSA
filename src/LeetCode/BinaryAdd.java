package LeetCode;

public class BinaryAdd {
    public static void main(String[] args) {
        String a = "1101";
        String b = "11";
        System.out.println(myaddBinary1(a, b));
    }

    // failed for the long input
    public static String myaddBinary(String a, String b) {
        Long c = Long.parseLong(a, 2) + Long.parseLong(b, 2);
        return Long.toBinaryString(c);
    }

    public static String myaddBinary1(String a, String b) {
        StringBuilder br = new StringBuilder();
        int alen = a.length() - 1;
        int blen = b.length() - 1;
        int carry = 0;
        while (alen >= 0 || blen >= 0 || carry == 1) {

        }

        return br.toString();
    }
}
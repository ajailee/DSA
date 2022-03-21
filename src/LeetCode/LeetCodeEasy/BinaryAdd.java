package LeetCodeEasy;

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
        while (alen >= 0 || blen >= 0) {
            int sum = carry;
            if (alen >= 0)
                sum = sum + (a.charAt(alen--) - '0');
            if (blen >= 0)
                sum = sum + (b.charAt(blen--) - '0');
            br.append(sum % 2);
            carry = sum / 2;

        }
        if (carry != 0) {
            br.append(carry);
        }
        return br.reverse().toString();
    }
}
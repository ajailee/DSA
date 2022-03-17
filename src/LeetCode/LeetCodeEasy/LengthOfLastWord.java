package LeetCode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "    day";
        System.out.println(lengthOfLastWordLeetCode(s));
        System.out.println(lengthOfLastWordMy(s));
    }

    public static int lengthOfLastWordMy(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }

    // effecient method
    public static int lengthOfLastWordLeetCode(String s) {
        int c = 0;
        s = s.trim();
        System.out.println(s);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) != ' ') {
                ++c;
            } else {

                return c;
            }

        }
        return c;
    }
}

package LeetCode;

//14. Longest Common Prefix
public class LargestPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    }

    public static String longestCommonPrefix(String[] strs) {
        boolean flag = true;
        int max = 0;
        char[] s1 = strs[0].toCharArray();
        int i = 0;
        while (flag) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() - 1 < i || strs[j].charAt(i) != s1[i]) {
                    flag = false;
                    max = i;
                    break;
                }
            }
            i++;
        }
        if (max == 0) {
            return "";
        }
        return strs[0].substring(0, max);
    }

}

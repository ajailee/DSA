package LeetCodeEasy;

public class ValidPalandrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // String s = "0P";
        System.out.println(isPalandrom(s));
    }

    public static boolean isPalandrom(String s) {
        int left = 0;
        int right = s.length() - 1;
        if (s.trim().length() == 0)
            return true;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;
    }
}

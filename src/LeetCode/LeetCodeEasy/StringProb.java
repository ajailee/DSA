package LeetCodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProb {
    public static void main(String[] args) {
        String s = "The sun rises in the east";
        String[] words = s.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            if ((i + 1) % 2 != 0) {
                result.append(Odd(words[i])).append(" ");
            } else {
                result.append(evenNumber(words[i])).append(" ");
            }
        }
        System.out.println(result.toString());
    }

    public static String Odd(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String evenNumber(String s) {
        StringBuilder br = new StringBuilder();
        String c = "";
        String v = "";
        List<Character> list = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                v = v + s.charAt(i);
            } else {
                c = c + s.charAt(i);
            }
        }
        return br.append(c).append(v).toString();
    }

}

package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestSubString {
    public static void main(String[] args) {
        String a = "abcabcbb";
        HashSet set = new HashSet<Character>();
        for (Character c : a.toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());

    }
}

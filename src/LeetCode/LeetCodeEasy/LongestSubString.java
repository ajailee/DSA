package LeetCodeEasy;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String a = "abcabcbb";
        HashSet<Character> set = new HashSet<Character>();
        for (Character c : a.toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());

    }
}

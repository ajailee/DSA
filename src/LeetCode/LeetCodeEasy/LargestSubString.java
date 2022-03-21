package LeetCodeEasy;

import java.util.HashMap;
import java.util.HashSet;

public class LargestSubString {
    public static void main(String[] args) {

        // All the possible characters in the input string
        // This shall keep the right after position at which the character was last
        // found at
        // int[] charsPossible = new int[127];
        System.out.println(getMax());
        // int longest = 0;
        // int startingIndex = 0;
        // // Go through each character
        // char[] chars = s.toCharArray();
        // for (int i = 0; i < chars.length; i++) {
        // char character = chars[i];
        // // Is the character found (!= 0)
        // // and the last index known is higher than our starting index
        // // We have to then start from next position
        // if (charsPossible[character] > 0 && startingIndex < charsPossible[character])
        // {
        // // We will start the new substring from the last index that this char left at
        // startingIndex = charsPossible[character];
        // }
        // // Update that char to point to next index
        // charsPossible[character] = i + 1;

        // // Substring size so far
        // int current = i - startingIndex + 1;
        // if (current > longest)
        // longest = current;
        // }
        // System.out.println(longest);
        // Return longest found so far
        // longest;

    }

    static int getMax() {
        String s = "dvdfe";
        int maxlen = 0;
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (map.containsKey(c[i])) {
                if (maxlen < map.size()) {
                    maxlen = map.size();
                }
                System.out.println(map.toString());
                map.clear();
            } else {
                map.put(c[i], i);
                if (maxlen < map.size()) {
                    maxlen = map.size();
                }
            }
        }
        return maxlen;

    }
}

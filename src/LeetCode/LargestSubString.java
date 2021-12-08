package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LargestSubString {
    public static void main(String[] args) {
        String s = "pwwkew";

        // All the possible characters in the input string
        // This shall keep the right after position at which the character was last
        // found at
        int[] charsPossible = new int[127];

        int longest = 0;
        int startingIndex = 0;
        // Go through each character
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            // Is the character found (!= 0)
            // and the last index known is higher than our starting index
            // We have to then start from next position
            if (charsPossible[character] > 0 && startingIndex < charsPossible[character]) {
                // We will start the new substring from the last index that this char left at
                startingIndex = charsPossible[character];
            }
            // Update that char to point to next index
            charsPossible[character] = i + 1;

            // Substring size so far
            int current = i - startingIndex + 1;
            if (current > longest)
                longest = current;
        }
        System.out.println(longest);
        // Return longest found so far
        // longest;

    }
}

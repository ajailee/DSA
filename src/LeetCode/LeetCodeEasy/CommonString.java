package LeetCodeEasy;

import java.util.LinkedHashSet;

public class CommonString {
    public static void main(String[] args) {
        String s1 = "I like Python";
        String s2 = "Java is a very popular language";
        String result = "";

        LinkedHashSet<Character> s1set = new LinkedHashSet<Character>();
        LinkedHashSet<Character> s2set = new LinkedHashSet<Character>();

        for (char c : s1.toCharArray()) {

            if (c != ' ')
                s1set.add(c);
        }
        System.out.println(s1set);
        for (char c : s2.toCharArray()) {
            if (c != ' ')
                s2set.add(c);
        }
        for (char c : s1set) {
            if (s2set.contains(c)) {
                result += c;
            }
        }
        System.out.println(result);
        // we can use retainAll which is like AND operation
        System.out.println(s1set.retainAll(s2set));
        System.out.println(s1set);
    }
}

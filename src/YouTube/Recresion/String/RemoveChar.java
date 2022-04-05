package Recresion.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveChar {
  public static void main(String[] args) throws java.io.IOException {
    String s = "adfdddbccabcaajdfds";
    String ans = remove(s, 0);
    System.out.println(ans);
    skip("", s);
  }

  private static String remove(String s, int index) {
    if (index > s.length() - 1) {
      return "";
    }
    if (!(s.charAt(index) == 'd')) {
      return s.charAt(index) + remove(s, index + 1);
    }
    return remove(s, index + 1);
  }

  private static void skip(String result, String input) {
    if (input.isEmpty()) {
      System.out.print(result);
      return;
    }
    if (input.charAt(0) != 'd') {
      skip(result + (input.charAt(0) + ""), input.substring(1));
    } else {
      skip(result, input.substring(1));
    }
  }
}

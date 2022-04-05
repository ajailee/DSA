package Recresion.String;
public class RemoveChar {
  public static void main(String[] args) throws java.io.IOException {
    String s = "adfdddbccabcaajddfddsddd";
        String ans = remove(s, 0);
        System.out.println(ans);
        skip("", s);
    System.out.println(skipWord("", s, "ddd"));
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
      System.out.println(result);
      return;
    }
    if (input.charAt(0) != 'd') {
      skip(result + (input.charAt(0) + ""), input.substring(1));
    } else {
      skip(result, input.substring(1));
    }
  }

  private static String skipWord(String result, String input, String skipWord) {
    if (input.isEmpty()) {
      return result;
    }
    if (input.length() < skipWord.length()) {
      result += input;
      return result;
    }
    if (input.substring(0, skipWord.length()).equals(skipWord)) {
      return skipWord(result, input.substring(skipWord.length()), skipWord);
    } else {
      return skipWord(result + input.charAt(0), input.substring(1), skipWord);
    }
  }
}

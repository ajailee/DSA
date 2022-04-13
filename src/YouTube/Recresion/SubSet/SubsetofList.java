package Recresion.SubSet;

import java.util.ArrayList;

public class SubsetofList {
  public static void main(String[] args) {
    String input = "abc";
    ArrayList<String> resultList = new ArrayList<>();
    set("", input);
    setList("", input, resultList);
    System.out.println(resultList);
    System.out.println(setList("", input));
  }

  static void set(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
      boolean subset = true;
      for (int i = 0; i < processed.length() - 1; i++) {
        if (processed.charAt(i) + 1 != processed.charAt(i + 1)) {
          subset = false;
          break;
        }
      }
      if (subset)
        System.out.println(processed);
      return;
    }
    set(processed, unprocessed.substring(1));
    set(processed + unprocessed.substring(0, 1), unprocessed.substring(1));
  }

  static void setList(String processed, String unprocessed, ArrayList<String> resultList) {
    if (unprocessed.isEmpty()) {
      boolean subset = true;
      for (int i = 0; i < processed.length() - 1; i++) {
        if (processed.charAt(i) + 1 != processed.charAt(i + 1)) {
          subset = false;
          break;
        }
      }
      if (subset && !processed.isEmpty())
        resultList.add(processed);
      return;
    }
    setList(processed, unprocessed.substring(1), resultList);
    setList(processed + unprocessed.substring(0, 1), unprocessed.substring(1), resultList);
  }

  static ArrayList<String> setList(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
      ArrayList<String> s = new ArrayList<>();
      boolean subset = true;
      for (int i = 0; i < processed.length() - 1; i++) {
        if (processed.charAt(i) + 1 != processed.charAt(i + 1)) {
          subset = false;
          break;
        }
      }
      if (subset && !processed.isEmpty())
        s.add(processed);
      return s;
    }
    ArrayList<String> left = setList(processed, unprocessed.substring(1));
    ArrayList<String> right = setList(processed + unprocessed.substring(0, 1), unprocessed.substring(1));
    left.addAll(right);
    return left;
  }
}

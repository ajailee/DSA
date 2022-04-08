package Recresion;

import java.util.*;

public class PhoneNumberCombination {
  public static void main(String[] args) {
    String number = "23";
    HashMap<Integer, String> map = new HashMap<>();
    int alp = (int) 'a';
    for (int i = 2; i < 10; i++) {
      String ans = "";
      ans = ans + (char) alp;
      alp = alp + 1;
      ans = ans + (char) alp;
      alp = alp + 1;
      ans = ans + (char) alp;
      map.put(i, ans);
      alp = alp + 1;
      ans = ans + (char) alp;
      if (i == 9 || i == 7) {
        map.put(i, ans);
        alp = alp + 1;
      }
      ;
    }

    System.out.println(findCombinations("a", "de"));
  }

  static List<String> findCombinations(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
      List<String> result = new ArrayList<>();
        result.add(processed);
      return result;
    }
    List<String> left =
        findCombinations(processed + unprocessed.charAt(0), unprocessed.substring(1));
    List<String> right = findCombinations(processed, unprocessed.substring(1));
    left.addAll(right);
    return left;
  }
}

package Recresion.SubSet;

import java.util.*;

public class PhoneNumberCombination {
  static HashMap<Integer, String> map = new HashMap<>();

  public static void main(String[] args) {
    load();
    String number = "";
    ArrayList<String> list = new ArrayList<>();
    findCombinations("", number, list);
    System.out.println(list);
  }

  static void findCombinations(String processed, String unprocessed, ArrayList<String> list) {
    if (unprocessed.isBlank()) {
      list.add(processed);
      return;
    }
    String s = getString(unprocessed.charAt(0) + "");
    for (int i = 0; i < s.length(); i++) {
      findCombinations(processed + s.charAt(i), unprocessed.substring(1), list);
    }
  }

  static String getString(String processed) {
    return map.get(Integer.parseInt(processed));
  }

  static void load() {
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
    }
  }
}

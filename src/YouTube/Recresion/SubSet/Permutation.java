package Recresion.SubSet;

public class Permutation {
  public static void main(String[] args) {
    permutation("","abc");
  }

  static void permutation(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }
    StringBuilder br = new StringBuilder(processed);
    for(int i=0;i<=processed.length();i++){
      br.insert(i, unprocessed.charAt(0));
      permutation(br.toString(),unprocessed.substring(1));
      br = new StringBuilder(processed);
    }
    }
}

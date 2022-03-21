package LeetCodeEasy;

import java.text.DecimalFormat;

public class ReverseBit {
  public static void main(String[] args) {
      int input = 43261596;
      String signed = Integer.toString(input,2);
      signed=  String.format("%32s","11111111111111111111111111111101").replace(" ","0");
    System.out.println(signed);
    StringBuilder br = new StringBuilder(signed);
    br=br.reverse();
    System.out.println(br);
    System.out.println(Integer.parseUnsignedInt(br.toString(),2));

  }
}

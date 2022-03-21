package Recresion.Basic;

public class ReverseNumber {
    static int sum=0;
  public static void main(String[] args) {
    int n=102370;
    //last(n);
    int result = reverse(n);
    System.out.println(result);
    //System.out.println(sum);
  }

  static  int reverse(int n){
      if(n%10==n){
          return n;

      }
      String s = String.valueOf(n/10);
      int len = s.length();
      int r=(int)Math.pow(10,len);
      return ((n%10)*r) + reverse(n/10);
  }

    private static int helper(int i) {
      String s = String.valueOf(i);
      int len = s.length();
      int r=(int)Math.pow(10,len);
      return r;
    }

    private static void last(int n) {
      if (n == 0) {
      return ;
      }
      sum=(sum*10)+n%10;
      last(n/10);
    }
}

package Recresion.Basic;

public class ProductOfDigits {
  public static void main(String[] args) {
    int n=100;
    int ans = prod(n);
    System.out.println(ans);
  }
  static int prod(int n){
      if(n%10==n){
          return n;
      }
      return (n%10)!=0?  (n%10) * prod(n/10) : prod(n/10);
  }
}

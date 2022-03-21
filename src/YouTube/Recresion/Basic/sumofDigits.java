package Recresion.Basic;

public class sumofDigits {
    static int sum=0;
  public static void main(String[] args) {
    int digit =123456;
    int result = sum(digit);
    bugSum(digit);
    System.out.println(result);
    System.out.println(sum);
  }

    private static int sum(int digit) {
      if(digit<=0){
          return 0;
      }
      return digit%10 + sum(digit/10);
    }
    private static  void bugSum(int digit){
        if(digit<=0){
            return;
        }
        sum=sum+digit%10;
        digit=digit/10;
        bugSum(digit);
    }
}

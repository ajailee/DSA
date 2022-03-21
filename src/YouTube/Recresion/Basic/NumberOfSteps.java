package Recresion.Basic;

public class NumberOfSteps {
  public static void main(String[] args) {
    int n=14;
    int result = noOfSteps(n);
    int count=0;
    int helperResult = noOfStepsWithHelper(n,count);
    System.out.println(helperResult);
    System.out.println(result);
  }
  static int noOfSteps(int n){
      if(n<=0){
          return 0;
      }
      if(n%2==0){
          return 1+noOfSteps(n/2);
      }
      return 1+noOfSteps(n-1);
  }
  static int noOfStepsWithHelper(int n,int count){
      return helper(n,count);
  }
  static int helper(int n,int count){
      if(n<=0){
          return count;
      }
      if(n%2==0){
          return helper(n/2,count+1);
      }
      return helper(n-1,count+1);
  }
}

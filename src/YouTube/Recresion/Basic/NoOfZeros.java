package Recresion.Basic;

public class NoOfZeros {
  public static void main(String[] args) {
    int n=1200121200;
    int result = noOfZeros(n);
    int result1[] = noOfZerosWithCount(n,0,0);
    System.out.println("no.of zero "+result1[0]+" no of one "+result1[1]);
    System.out.println(result);
  }
  static int noOfZeros(int n){
    if(n<=0){
        return 0;
    }
    if(n%10==0){
        return 1+noOfZeros(n/10);
    }
    return noOfZeros(n/10);
  }
  static int[] noOfZerosWithCount(int n,int zero,int one){
      if(n<=0){
          return new int[]{zero,one};
      }
      if(n%10==1){
        return noOfZerosWithCount(n/10,zero,one+1);
      }
      if(n%10==0){
        return noOfZerosWithCount(n/10,zero+1,one);
      }
      return noOfZerosWithCount(n/10,zero,one);
  }
}

package Recresion.Basic;


public class Fibo{
   static int trailing_zero(int num){
      int result=fact(num);
      int count=0;
      String s=String.valueOf(result);
      for (int i=s.length()-1;i>0;i--){
         if(s.charAt(i)=='0'){
            count++;
         }else {

            return count;
         }
      }
      return count;
   }
   static  int fact(int n){
      if(n==1){
         return 1;
      }
      return n*fact(n-1);
   }
   public static void main (String[] args){
      int num = 5;
      System.out.println("The number of trailing zeroes in " + num +" factorial is " +
      trailing_zero(num));
   }
}
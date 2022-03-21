package Recresion.Basic;

public class Concept {
  public static void main(String[] args) {
    correctFun(5);
    wrongFun(5);
  }

    private static void wrongFun(int i) {
      if(i==0){
          return;
      }
    System.out.println(i);
      wrongFun(i--);
    }

    private static void correctFun(int i) {
      if(i==0){
          return;
      }
    System.out.println(i);
      correctFun(--i);
    }

}

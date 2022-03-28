import java.util.Stack;

public class StringDecode {
  public static void main(String[] args) {
      String input= "2[a]";
      Stack<Character> stack = new Stack<Character>();
      find(input);
  }
  static  void find(String input){
        int open  = input.indexOf('[');
        int close = input.indexOf(']');
        int num = Integer.valueOf(input.charAt(open-1)+"");
        System.out.println(num);
        System.out.println(input.substring(open+1,close));
  }
}

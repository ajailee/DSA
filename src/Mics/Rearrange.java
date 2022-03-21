public class Rearrange {
  public static void main(String[] args) {
    String s1="zbk";
    String s2="zkb";
    for (int i=0;i<s2.length();i++){
      s1=  s1.replace(s2.toCharArray()[i]+"","");
    }
    System.out.println(s1);
    if(s1.length()==0){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}

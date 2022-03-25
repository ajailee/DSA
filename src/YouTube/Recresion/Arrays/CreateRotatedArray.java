package Recresion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateRotatedArray {
  public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.addAll(Arrays.asList(1,2,3,4,5,6,7));
      ArrayList l = rotate(list,0);
      System.out.println(l);
  }
  static ArrayList getRotatedArrayList(){
      ArrayList<Integer> list = new ArrayList<>();
      list.addAll(Arrays.asList(1,2,3,4,5,6,7));
      return rotate(list,0);
  }
  static ArrayList rotate(ArrayList arrayList,int count){
      if(count==5){
          return arrayList;
      }
      Object last=arrayList.get(arrayList.size()-1);
      arrayList.remove(last);
      arrayList.add(0,last);
      rotate(arrayList,count+1);
      return arrayList;
  }
}

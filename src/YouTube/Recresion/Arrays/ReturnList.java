package Recresion.Arrays;


// We can easily pass the ArrayList if it is in a parameter but passing it from the body is some complex way
// we can use these logics to do that
import java.util.ArrayList;

public class ReturnList {
  public static void main(String[] args) {
      ArrayList<Integer> result = getList(0);
      System.out.println(result);
      int[] arr ={1,2,3,4,4,5};
      int target = 4;
      ArrayList<Integer> indexList = getIndexes(arr,target,0);
    System.out.println(indexList);
  }
  // have the array list in the body
  // return the array list by adding the
  static ArrayList getList(int i){
      ArrayList<Integer> list = new ArrayList<>();
      if(i==5){
          list.add(5);
          return list;
      }
       list.add(i);
       list.addAll(getList(i+1));
       return list;
  }

  static ArrayList getIndexes(int[] arr,int target,int index){
      ArrayList arrayList =  new ArrayList<>();
      if(index==arr.length){
          return arrayList;
      }
      if(arr[index]==target){
          arrayList.add(index);
      }
       arrayList.addAll(getIndexes(arr,target,index+1));
       return arrayList;
  }
}

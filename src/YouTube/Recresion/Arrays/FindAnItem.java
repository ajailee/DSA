package Recresion.Arrays;

import java.util.ArrayList;

public class FindAnItem {


  public static void main(String[] args) {
      int[] arr =new int[]{1,2,3,4,4,5};
      int target = 4;
      ArrayList<Integer> indexList = new ArrayList<Integer>();
      int index = findEle(arr,target,0);
      System.out.println(elePresentOrNot(arr,target,0));
      System.out.println(index);
      System.out.println(findAllIndex(arr,target,0,indexList));
  }
  static ArrayList findAllIndex(int[] arr,int target,int index,ArrayList<Integer> indexList){
      if(index==arr.length){
          return indexList;
      }
      if(arr[index]==target){
          indexList.add(index);
      }
      return findAllIndex(arr,target,index+1,indexList);
  }
  static boolean elePresentOrNot(int[] arr,int target,int index){
      if(index>arr.length-1){
          return false;
      }
      if(arr[index]==target){
          return true;
      }
      return elePresentOrNot(arr,target,index+1);
  }
    static boolean elePresentOrNot2(int[] arr,int target,int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index]==target || elePresentOrNot2(arr,target,index+1);
    }

  static int findEle(int[] arr,int target,int index){
    if(index>arr.length-1){
        return -1;
    }
    if(arr[index]==target){
        return index;
    }
     return findEle(arr,target,index+1);
  }
}

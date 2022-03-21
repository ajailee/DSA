package Recresion.Arrays;

public class Sorted {
  public static void main(String[] args) {
   int[] arr =new int[]{1,2,3,4,5};
   boolean result=isSorted(arr,0);
    System.out.println(result);
  }
  static boolean isSorted(int[] arr,int i){
    if(i+1 == arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return  (arr[i]<arr[i+1] ) && isSorted(arr,i+1);
  }
}

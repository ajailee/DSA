package Search;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr= {1,4,7,2,10,6,3};
    int[] res = sort(arr,0,arr.length-1);
    for(int a:res){
      System.out.print(a);
    }
  }
  static int[] sort(int[] arr,int start,int end){
      if(start>end){
          return arr;
      }
      if(start<end){
          if(arr[start]>arr[end]){
                int temp = arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
               return sort(arr,0,end-1);
          }
      }
      return sort(arr,start+1,end);
  }
}

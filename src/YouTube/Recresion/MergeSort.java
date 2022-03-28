package Recresion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSort {
  public static void main(String[] args) {
    int arr[] = {4,2,6,10,14,13,1,0};
        int[] result = split(arr);
        System.out.println(Arrays.toString(result));
}

public static int[] merge(int[] right,int[] left){
      int lp = 0;
      int rp = 0;
      int np=0;
      int[] result = new int[right.length+left.length];
      while (lp<left.length&& rp<right.length){
          if(left[lp]<right[rp]){
              result[np] = left[lp];
              lp++;
              np++;
          }else{
              result[np] = right[rp];
              rp++;
              np++;
          }
      }
     while (lp<left.length){
         result[np] = left[lp];
         lp++;
         np++;
     }
     while (rp<right.length){
         result[np]=right[rp];
         rp++;
         np++;
     }
      return result;
}
  public static  int[] split(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = split(Arrays.copyOfRange(arr,0,mid));
        int[] right = split(Arrays.copyOfRange(arr,mid,arr.length));
        int[] res = merge(right,left);
        return res;
        }
}

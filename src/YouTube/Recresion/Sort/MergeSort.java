package Recresion.Sort;

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

  public  static void inplaceSplit(int[] arr,int start,int end){
      if(start==end){
          return;
      }
      int mid = arr.length/2;
      inplaceSplit(arr,start,mid);
      inplaceSplit(arr,mid,arr.length);

  }

  public static  int[] split(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = split(Arrays.copyOfRange(arr,0,mid));
        int[] right = split(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
  }

  public static int[] merge(int[] left,int[] right){
        int lp = 0;
        int rp = 0;
        int np=0;
        int[] result = new int[right.length+left.length];
        while (lp<left.length && rp<right.length){
            if(left[lp]<right[rp]){
                result[np] = left[lp];
                lp++;
            }else{
                result[np] = right[rp];
                rp++;
            }
            np++;
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
    static void swap(int first,int second,int[] arr){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void inplacemerge(int[]arr,int start,int end){
        int lp = 0;
        int rp = 0;

    while (lp < start && rp < end) {
      if (arr[lp] < arr[rp]) {
        swap(start, end, arr);
      } else {
        swap(end, start, arr);
      }
    }
    }
}


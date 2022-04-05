package Recresion.Sort;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = {5,6,3,2,1};
    int start=0;
    int end=arr.length-1;
    quickSort(arr,start,end);
    System.out.println(Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int start, int end) {
      int s=start;
      int e=end;
      int mid = start +(end-start) /2;
      int pivot = arr[mid];
      if(start>=end){
          return;
      }
      while(s<=e){
          while (arr[s]<pivot){
              s++;
          }
          while (arr[e]>pivot){
              e--;
          }
          if(s<=e){
              swap(s,e,arr);
              s++;
              e--;
          }
      }
      quickSort(arr,start,e);
      quickSort(arr,s,end);
  }
  static void swap(int first,int second,int[] arr){
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
  }
}

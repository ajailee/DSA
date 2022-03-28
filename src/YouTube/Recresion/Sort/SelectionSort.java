package Recresion.Sort;

import java.util.Arrays;

public class SelectionSort {
    static int[] arr = {4,3,1,2,-8};
  public static void main(String[] args) {
    selectionSort(arr.length,0,0);
    System.out.println(Arrays.toString(arr));

  }

    private static void selectionSort(int r, int c, int max) {
      if(r==0){
          return;
      }
      if(c<r){
          if(arr[max]<arr[c]){
              selectionSort(r,c+1,c);
          }else{
              selectionSort(r,c+1,max);
          }
      }else{
          int temp = arr[max];
          arr[max] = arr[r-1];
          arr[r-1] = temp;
          selectionSort(r-1,0,0);
      }
    }

}

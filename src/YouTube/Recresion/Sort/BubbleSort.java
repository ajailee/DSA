package Recresion.Sort;

import java.util.Arrays;

public class BubbleSort {
    static int[] arr ={5, 1, 4, -2,20 ,15};
  public static void main(String[] args) {

      int start=0;
      int end=arr.length-1;
      int first=0;
      int second=1;
      //int[] result= bubbleSort(start,end,first,second,arr);
      bubble(end,0);
      Arrays.stream(arr).forEach((e)->{
          System.out.print(e+" ");
      });
  }
  static void bubble(int r,int c){
      if(r<0){
          return;
      }
      if(c<r){
          if(arr[c+1]<arr[c]){
              swap(c+1,c,arr);
          }
          bubble(r,c+1);
      }else {
          bubble(c-1,0);
      }
  }
  static int[] bubbleSort(int start,int end,int first,int second,int[] arr){
        if(start==end){
            return arr;
        }
        if(second>=end){
            if(arr[first]>arr[second])
                swap(first,second,arr);
            return bubbleSort(start,end-1,0,1,arr);
        }
        else if(arr[first]>arr[second]){
            swap(first,second,arr);
            return bubbleSort(start,end,first+1,second+1,arr);
        }

        return bubbleSort(start,end,first+1,second+1,arr);

  }
  static void swap(int first,int second,int[] arr){
      int temp = arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
  }
}

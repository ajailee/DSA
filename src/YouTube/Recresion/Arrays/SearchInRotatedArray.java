package Recresion.Arrays;

import java.util.ArrayList;

public class SearchInRotatedArray {
  public static void main(String[] args) {
   ArrayList<Integer> l = CreateRotatedArray.getRotatedArrayList();
    System.out.println(l);
   int start=0;
   int end = l.size()-1;
   for(int i=0;i<l.size();i++){
       int index = search(l,10,start,end);
       System.out.println(index);
   }
  }

    private static int search(ArrayList<Integer> l,int target, int start, int end) {
      if(start>end){
          return -1;
      }
      int mid = start + (end-start) /2;
        if(l.get(mid)==target){
            return mid;
        }
        if(l.get(start)<=l.get(mid)){

            if(target>=l.get(start) && target<=l.get(mid)){
                return search(l,target,start,mid-1);
            }else{
                return search(l,target,mid+1,end);
            }
        }
        //[7,8,9,1,2,3,4]

            if(target>=l.get(mid) && target <=l.get(end)){
                return search(l,target,mid+1,end);
            }else{
                return search(l,target,start,mid-1);
            }




    }
}

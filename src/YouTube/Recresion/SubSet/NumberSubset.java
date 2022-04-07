package Recresion.SubSet;

import java.util.*;

public class NumberSubset {
  public static void main(String[] args) {
    int[] n = {1,2,2};
    List<List<Integer>> answerList = new ArrayList<>();
    List<Integer> taken = new ArrayList<>();
    answerList.add(new ArrayList<>(taken));
    taken.add(n[0]);
    answerList.add(taken);
    for(int i=1;i<n.length;i++){
      List<List<Integer>> newanswerList = new ArrayList<>();
      for (List<Integer> k : answerList) {
        List<Integer> newtaken = new ArrayList<>(k);
        newanswerList.add(new ArrayList<>(newtaken));
        newtaken.add(n[i]);
        newanswerList.add(newtaken);
      }
      answerList=newanswerList;
    }
//    for(List<Integer> i:answerList){
//      System.out.println(i);
//    }
  }

  static List<List<Integer>> getAns(int[] a){
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num:a){
      int n = outer.size();
      for(int i=0;i<n;i++){
        ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
        inner.add(num);
        outer.add(inner);
      }

    }
    return outer;
  }
  static List<List<Integer>> getAnsDuplicate(int[] a){
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num=0;num<a.length;num++){
      int n = outer.size();
      if(num>0 && (a[num]!=a[num-1])){
        for(int i=0;i<n;i++){
          ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
          inner.add(a[num]);
          outer.add(inner);
        }
      }else{
        for(int i=0;i<n;i++){
          ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
          if (i >= n / 2) {
            inner.add(a[num]);
            outer.add(inner);
          }
        }
      }


    }
    return outer;
  }
}

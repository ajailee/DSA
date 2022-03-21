//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class MergeSort {
//  public static void main(String[] args) {
//    int a[] = {4,2,6,5,8,9,10,11,15};
//    int start = 0;
//    int end = a.length;
//    int mid =end/2;
//    Byte.
//    int[] sub = split(start,mid,a);
//    List<String> list = Arrays.asList("1", "2", "3", "4");
//
//    List<Integer> integerList = list.stream().map(c -> Integer.valueOf(c)).filter(num -> num%2==0).collect(Collectors.toList());
//    System.out.println(integerList);
//  }
//  public static  int[] split(int start,int end,int[] arr){
//      int newarr[] = new int[end];
//      end =end/2;
//      if(end>1){
//          for(int i=start;i<end;i++){
//              newarr[i]=arr[i];
//          }
//          return split(0,end,newarr);
//      }
//      return arr;
//  }
//}

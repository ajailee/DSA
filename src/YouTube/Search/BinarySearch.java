package Search;

public class BinarySearch {
  public static void main(String[] args) {
     int[]  numbers = new int[] {1,2,3,4,5,6,7,8,10,20,30,40,50,31,41,51,61,67,68,78,89,};
     int target = 89 ;
    System.out.println(numbers.length);
     int mid = numbers.length/2;
     int ans=find(target,numbers,0,numbers.length);
     System.out.println(ans);
  }
  static int find(int target,int[] numbers,int start,int end){
    if(end<start){
        return -1;
    }
    int mid=start+(end-start)/2;
    if(numbers[mid]==target) return mid;
    if(numbers[mid]<target){
        return find(target,numbers,mid+1,end);
    }else{
        return find(target,numbers,start,mid-1);
    }
  }
}

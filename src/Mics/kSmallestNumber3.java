import java.util.Arrays;
import java.util.Scanner;

public class kSmallestNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int[] arr = { 7, 10, 4, 20, 15 };
        // Using Sort Method
        Arrays.sort(arr);
        System.out.println("Min Element at Kth position->" + arr[k - 1]);
        // Using User Defined Method
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
            } else {
                int temp = 0;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Min Element at Kth position->" + arr[k - 1]);
    }
}

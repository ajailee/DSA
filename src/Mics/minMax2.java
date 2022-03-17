import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class minMax2 {
    public static void main(String[] args) {
        int[] arr = { 11, 25, 53, 14, 51 };
        // using sort method
        System.out.println("Using Sort Method");
        Arrays.sort(arr);
        System.out.println("min->" + arr[0]);
        System.out.println("max->" + arr[arr.length - 1]);

        System.out.println("Using Collections");
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        System.out.println("min->" + Collections.min(list));
        System.out.println("Max->" + Collections.max(list));
        System.out.println("Using User defined");
        findMinMax(arr);
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int a : arr) {
            if (min > a) {
                min = a;
            }
            if (max < a) {
                max = a;
            }
        }
        System.out.println("Min->" + min);
        System.out.println("Max->" + max);
    }
}

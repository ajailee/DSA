import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.*;

public class reverseArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        ListIterator<Integer> i = list.listIterator();
        // Using the Stream and Collections
        System.out.println("Using Iterator");
        // https://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        while (i.hasPrevious()) {
            System.out.print(i.previous() + " ");
        }
        System.out.println("Using Sort Collection Method");
        // https://www.javatpoint.com/how-to-sort-an-array-in-java
        List<Integer> arr1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr1.toArray(), Collections.reverseOrder());

        System.out.println("Using For Loop");
        for (int j = 0; j < arr.length; j--) {
            System.out.println(arr[j]);
        }

    }
}

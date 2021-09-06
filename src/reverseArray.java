import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        ListIterator<Integer> i = list.listIterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        while (i.hasPrevious()) {
            System.out.print(i.previous() + " ");
        }

    }
}

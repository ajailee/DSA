import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] alist = { 1, 2, 2, 4, 1, 2, 4 };
        int[] blist = { 2, 5, 5, 11, 4, 9, 11, 2 };
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int a : blist) {
            if (map.containsKey(Integer.valueOf(a))) {
                map.put(Integer.valueOf(a), Integer.valueOf(map.get(Integer.valueOf(a)) + 1));
            } else {
                map.put(Integer.valueOf(a), Integer.valueOf(1));
            }
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(x -> map2.put(x.getKey(), x.getValue()));
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }

}
// https://www.instagram.com/p/CVp8HOGhfcg/
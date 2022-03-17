import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.instagram.com/p/CVvDu-Mv4Vu/?utm_source=ig_web_copy_link

public class MonsterProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        int maxSoFar = list[0];
        int maxEnd = list[0];
        for (int i : list) {
            maxEnd = Math.max(list[i], maxEnd + list[i]);
            maxSoFar = Math.max(maxEnd, maxSoFar);
            if (maxSoFar % k == 0) {

            }
        }
    }
}

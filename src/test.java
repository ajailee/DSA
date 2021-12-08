public class test {
    public static void main(String[] args) {
        System.out.println(student(10, new int[] { 1, 2, 7, 5, 7, 4, 1, 1, 2, 5 }));
    }

    static int student(int n, int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    count++;
                }
            }

        }
        return count;
    }
}
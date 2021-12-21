public class TwoPointer {
    public static void main(String[] args) {

        int[] are = new int[] { 1, 2, 3, 4, 5, 6 };
        String str = ("123456");
        int target = 5;
        int pointer_one = 0;
        System.out.println(are.length + "<->" + str.length());
        // to access the index we are using -1 to get the index value rathere than the postition value 
        int pointer_two = are.length - 1;
        while (pointer_one < pointer_two) {
            int sum = are[pointer_one] + are[pointer_two];
            if (sum == target) {
                System.err.println(pointer_one + "" + pointer_two);
                System.exit(0);
            } else if (sum < target) {
                pointer_one++;
            } else {
                pointer_two--;
            }
        }
    }
}

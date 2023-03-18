import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tugas3 {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = twoSum(number1, target1);
        System.out.println(Arrays.toString(result1));

        int[] number2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = twoSum(number2, target2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] twoSum(int[] number, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            int complement = target - number[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(number[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
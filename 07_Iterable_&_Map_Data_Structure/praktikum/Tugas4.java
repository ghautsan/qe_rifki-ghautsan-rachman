import java.util.*;

public class Tugas4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};
        int[] result1 = findUnique(array1, array2);
        System.out.println(Arrays.toString(result1));

        int[] array3 = {3, 8};
        int[] array4 = {2, 8};
        int[] result2 = findUnique(array3, array4);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] findUnique(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int unique : array2) {
            set.add(unique);
        }
        List<Integer> list = new ArrayList<>();
        for (int number : array1) {
            if (!set.contains(number)) {
                list.add(number);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
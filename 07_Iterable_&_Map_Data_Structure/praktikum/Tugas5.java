public class Tugas5 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 3, 3, 6, 9, 9};
        int len1 = removeDuplicates(array1);
        System.out.println(len1);

        int[] array2 = {2, 2, 2, 11};
        int len2 = removeDuplicates(array2);
        System.out.println(len2);
    }

    public static int removeDuplicates(int[] number) {
        if (number.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < number.length; j++) {
            if (number[j] != number[i]) {
                i++;
                number[i] = number[j];
            }
        }
        return i + 1;
    }
}
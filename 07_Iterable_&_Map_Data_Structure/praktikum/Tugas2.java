import java.util.ArrayList;
import java.util.List;

public class Tugas2 {
    public static void main(String[] args) {
        String input1 = "76523752";
        List<Integer> result1 = UniqueNumber(input1);
        System.out.println(result1);

        String input2 = "1122";
        List<Integer> result2 = UniqueNumber(input2);
        System.out.println(result2);
    }

    public static List<Integer> UniqueNumber(String input) {
        List<Integer> uniqueNumber = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                uniqueNumber.add(Character.getNumericValue(currentChar));
            }
        }
        return uniqueNumber;
    }
}
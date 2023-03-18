import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tekken1 = {"kazuya", "jin", "lee"};
        String[] tekken2 = {"kazuya", "feng"};

        String[] mergedTekken = mergeArrays(tekken1, tekken2);
        System.out.println(Arrays.toString(mergedTekken));

        String[] tekken3 = {"lee", "jin"};
        String[] tekken4 = {"kazuya", "panda"};

        String[] mergedTekken2 = mergeArrays(tekken3, tekken4);
        System.out.println(Arrays.toString(mergedTekken2));
    }

    public static String[] mergeArrays(String[] tekken1, String[] tekken2) {
        ArrayList<String> mergedList = new ArrayList<>(Arrays.asList(tekken1));
        for (String name : tekken2) {
            if (!mergedList.contains(name)) {
                mergedList.add(name);
            }
        }
        return mergedList.toArray(new String[0]);
    }
}
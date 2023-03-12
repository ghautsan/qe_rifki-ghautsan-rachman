public class Encrypt {
    private static String encrypt(String s) {
        //TODO: complete this code
        String result = "";
        int shift = 10;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result += ' ';
                continue;
            }
            char c = (char) (s.charAt(i) + shift);
            if (c > 'Z') {
                result += (char) (s.charAt(i) - (26 - shift));
            } else {
                result += c;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
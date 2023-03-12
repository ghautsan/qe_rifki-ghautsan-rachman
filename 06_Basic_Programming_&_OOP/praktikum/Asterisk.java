public class Asterisk {
    public static void printAsterisk(int n) {
        // TODO: complete this
        int Asterisk = 5;
        for (int i = 1; i <= Asterisk; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAsterisk(5);
    }
}

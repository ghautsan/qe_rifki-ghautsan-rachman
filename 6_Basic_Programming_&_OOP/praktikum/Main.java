class Main {
    public static void drawXYZ(int n) {
        //TODO: complete this code
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (count % 3 == 0) { // untuk kelipatan 3
                    System.out.print("X ");
                } else if (count % 2 == 1) { // untuk bilangan ganjil
                    System.out.print("Y ");
                } else {
                    System.out.print("Z "); // untuk bilangan genap
                }
                count++; // untuk mengecek bilangan tersebut ganjil, genap, atau kelipatan 3
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}
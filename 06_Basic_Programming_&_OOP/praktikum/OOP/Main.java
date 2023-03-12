package OOP;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("coffee", "this is coffee", 15000, 10);
        Product product2 = new Product("milk", "this is fresh milk", 25000, 10);
        Product product3 = new Product("apple juice", "this is juice", 18000, 20);

        product1.infoProduct();
        product2.infoProduct();
        product3.infoProduct();
    }
}
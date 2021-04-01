package lesson3.product;

public class ProductDemo {

    public static void main(String[] args) {

        Product productMilk = new Product("Milk");
        productMilk.setRegularPrice(0.8);
        productMilk.setDiscount(20);
        productMilk.printInformation();
    }
}

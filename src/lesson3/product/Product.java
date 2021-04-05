package lesson3.product;
//*********Checked**************
public class Product {

    private final String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice(double price, double disc) {
        return price - (price * (disc / 100));
    }

    public void printInformation() {
        System.out.printf("Product : " +
                "name = %s, " +
                "regular price = %s EUR, " +
                "discount = %s%%, " +
                "actual price = %s EUR", name, regularPrice, discount, actualPrice(regularPrice, discount));
    }
}

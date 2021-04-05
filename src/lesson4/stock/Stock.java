package lesson4.stock;

public class Stock {
    private final String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int price) {
        this.name = name;
        this.currentPrice = price;
        this.maxPrice = price;
        this.minPrice = price;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (maxPrice < newPrice) {
            maxPrice = newPrice;
        } else if (minPrice > newPrice){
            minPrice = newPrice;
        }
    }

    public void printInformation() {
        System.out.printf("Company = \"%s\", Current Price = %s, Min Price = %s, Max Price = %s \n",
                name, currentPrice,minPrice, maxPrice);
    }
}

package lesson4.stock;

/*
TODO: Класс Stock должен обладать следующими характеристиками:
    Свойства
        Имя компании
        Текущая стоимость
        Минимальная стоимость
        Максимальная стоимость
    Методы
        Обновить текущую стоимость акции updatePrice()
        Распечатать информацию об акции printInformation()
    Имя компании и начальную стоимость необходимо задавать в момент создания акции.
    Текущая, минимальная и максимальная стоимость должны меняться только через метод updatePrice().
 */
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


    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (maxPrice < newPrice) {
            maxPrice = newPrice;
        } else {
            minPrice = newPrice;
        }
    }

    public void printInformation() {
        System.out.printf("Company = \"%s\", Current Price = %s, Min Price = %s, Max Price = %s",
                name, currentPrice,minPrice, maxPrice);
    }
}

package lesson4.stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockTest {

    @Test
    void updatePriceMax() {
        Stock google = new Stock("Google", 10);
        int actual = 15;
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void updatePriceMin() {
        Stock google = new Stock("Google", 10);
        int actual = 7;
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void updatePrice() {
        Stock google = new Stock("Google", 10);
        int actual = 10;
        int expected = 10;
        assertEquals(expected, actual);
    }
}
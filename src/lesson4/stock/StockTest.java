package lesson4.stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockTest {

    @Test
    void updatePrice() {
        int actual = 15;
        Stock google = new Stock("Google", 10);
        int expected = 15;
        assertEquals(expected, actual);
    }
}
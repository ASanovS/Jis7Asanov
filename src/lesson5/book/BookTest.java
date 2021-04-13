package lesson5.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void getAuthor() {
        Book bookAuthor = new Book("Tom", "Book Java t.1", 200);
        String actualAuthor = "Tom";
        String expectedAuthor = bookAuthor.getAuthor();
        assertEquals(expectedAuthor, actualAuthor);
    }

    @Test
    void getName() {
        Book bookName = new Book("Tom", "Book Java t.1", 200);
        String actualName = "Book Java t.1";
        String expectedName = bookName.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    void getPages() {
        Book bookPages = new Book("Tom", "Book Java t.1", 200);
        int actualPages = 200;
        int expectedPages = bookPages.getPages();
        assertEquals(expectedPages, actualPages);
    }
}
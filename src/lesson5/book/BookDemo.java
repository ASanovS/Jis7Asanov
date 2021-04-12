package lesson5.book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Author", "Book1", 200);

        System.out.printf("Author - %s, book name - %s, pages - %s \n", book1.getAuthor(), book1.getName(), book1.getPages());

        book1.setAuthor("Author2");
        book1.setName("Book v 1.1");
        book1.setPages(500);

        System.out.printf("Author - %s, book name - %s, pages - %s \n", book1.getAuthor(), book1.getName(), book1.getPages());
    }
}

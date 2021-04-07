package lesson10.dataBase;

public class Application {
    public static void main(String[] args) throws ItemNotFoundException {
        BookRepository bookRepository = new BookRepository();

        Book b1 = new Book("1", "One", "One", 100);
        Book b2 = new Book("2", "Two", "Two", 100);
        Book b3 = new Book("3", "Three", "Three", 100);
        Book b4 = new Book("4", "Four", "Four", 100);

        bookRepository.save(b1);
        bookRepository.save(b2);
        bookRepository.save(b3);
        bookRepository.save(b4);

        for (Book book : bookRepository.findAll()) {
            System.out.printf("%s \n", book);
        }

        System.out.println(bookRepository.findById("1"));
    }
}

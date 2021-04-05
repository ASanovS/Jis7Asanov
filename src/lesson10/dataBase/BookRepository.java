package lesson10.dataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {
    Map<String, Book> bookDataBase = new HashMap<>();


    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        return null;
    }

    @Override
    public void save(Book item) {

    }

    @Override
    public void delete(String id) throws ItemNotFoundException {

    }
}

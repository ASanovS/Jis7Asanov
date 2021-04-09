package lesson10.dataBase;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {
    Map<String, Book> bookRepository = new HashMap<>();
    ItemNotFoundException exception = new ItemNotFoundException();

    @Override
    public List<Book> findAll() {
        return new LinkedList<>(bookRepository.values());
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (bookRepository.get(id) == null) {
           exception.itemNotFoundException();
        }
        return bookRepository.get(id);
    }

    @Override
    public void save(Book item) {
        bookRepository.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (bookRepository.get(id) == null) {
            exception.itemNotFoundException();
        }
        bookRepository.remove(id);
    }
}

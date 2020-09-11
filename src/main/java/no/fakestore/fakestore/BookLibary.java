package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookLibary {

    private List<Book> books;

    public BookLibary() {
        books = new ArrayList<>();
        books.add(new Book("20.00", 10001, "Fox in Sox", "Dr.Seuss", "Random House", BookGenre.CHILDREN, "Awesome children's book.", "June 19, 1965", "English", "For all ages.", "Assets/foxinsox.png"));
    }

    public List<Book> getBooks() {
        return books;
    }
}

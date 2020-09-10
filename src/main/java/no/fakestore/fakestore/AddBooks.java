package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddBooks {

    private List<Book> books;

    public AddBooks() {
        books = new ArrayList<>();
        books.add(new Book(20.00, 10001, "Fox in Sox", "Dr.Seuss", "Random House", BookGenre.CHILDREN, "Awesome children's book.", "19.06.1965", "English", "For all ages."));
    }

    public List<Book> getBooks() {
        return books;
    }
}

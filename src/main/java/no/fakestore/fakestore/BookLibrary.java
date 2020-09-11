package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookLibrary {

    private List<Book> books;

    public BookLibrary() {
        books = new ArrayList<>();
        books.add(new Book("20.00", 10001, "Fox in Sox", "Dr.Seuss", "Random House", BookGenre.CHILDREN, "Awesome children's book.", "June 19, 1965", "English", "For all ages.", "/Assets/foxinsox.png"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getPage(int page, int pageSize) {
        int from = Math.max(0,page*pageSize);
        int to = Math.min(books.size(),(page+1)*pageSize);

        return books.subList(from, to);
    }

    public int numberOfPages(int pageSize) {
        return (int)Math.ceil((double) books.size() / pageSize);
    }

    public Book getBook(int id) {
        for (Book book : books) {
            if (book.getProductId() == id) {
                return book;
            }
        }
        return null;
    }
}

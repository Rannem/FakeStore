package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookLibrary {

    private List<Book> books;

    public BookLibrary() {
        books = new ArrayList<>();
        books.add(new Book("20.00", 11001, "Fox in Sox", "Dr.Seuss", "Random House", BookGenre.CHILDREN, "Awesome children's book.", "June 19, 1965", "English", "For all ages.", "/Assets/foxinsox.png"));
        books.add(new Book("43.00", 11002, "Peer to peer", "A. Moberg", "Academy", BookGenre.ROMANCE, "A close up interview", "June 19, 1998", "English", "18+", "/Assets/moberg.jpg"));
        books.add(new Book("24.00", 11003, "The Audacity of Hope", "B. Obama", "White House", BookGenre.THRILLER, "Thoughts on Reclaiming the American Dream", "September 25, 2006", "English", "For all ages.", "/Assets/obamabook.jpg"));
        books.add(new Book("54.00", 11004, "Klovn i kamp", "Lill Smith", "ABC", BookGenre.HISTORY, "A mad man in power.", "May 19, 20018", "Norsk", "For all ages.", "/Assets/donald.jpg"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getPage(int page, int pageSize) {
        int from = Math.max(0, page * pageSize);
        int to = Math.min(books.size(), (page + 1) * pageSize);

        return books.subList(from, to);
    }

    public int numberOfPages(int pageSize) {
        return (int) Math.ceil((double) books.size() / pageSize);
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

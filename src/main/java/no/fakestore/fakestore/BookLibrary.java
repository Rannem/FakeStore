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
        books.add(new Book("43.00", 10002, "Peer to peer", "A. Moberg", "Academy", BookGenre.ROMANCE, "A close up interview", "June 19, 1998", "English", "18+", "/Assets/moberg.jpg"));
        books.add(new Book("24.00", 10003, "Black fist", "B. Obama", "White House", BookGenre.THRILLER, "From Africa to a white villa", "June 19, 2000", "English", "For all ages.", "/Assets/obama.png"));
        books.add(new Book("54.00", 10004, "Klovn i kamp", "Lill Smith", "ABC", BookGenre.HISTORY, "A mad man in power.", "May 19, 20018", "Norsk", "For all ages.", "/Assets/donald.jpg"));
    }

    public List<Book> getBooks() {
        return books;
    }
}

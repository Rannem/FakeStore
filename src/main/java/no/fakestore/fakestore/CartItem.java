package no.fakestore.fakestore;

import no.fakestore.fakestore.Book.Book;
import no.fakestore.fakestore.Game.Game;
import no.fakestore.fakestore.Movie.Movie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Optional;

@Entity
public class CartItem {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Book book;
    @ManyToOne
    private Game game;
    @ManyToOne
    private Movie movie;

    public CartItem(Book book) {
        this.book = book;
    }

    public CartItem(Game game) {
        this.game = game;
    }

    public CartItem(Movie movie) {
        this.movie = movie;
    }

    public CartItem() {

    }
}


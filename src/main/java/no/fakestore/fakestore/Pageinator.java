package no.fakestore.fakestore;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;

@Service
public class Pageinator {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;

    public Pageinator(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
    }

    public Slice<Book> getAllBooks(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 1, Sort.by("title").ascending());
        Slice<Book> pagedResult = bookRepo.findAll(pageable);
        return pagedResult;
    }

    public Slice<Movie> getAllMovies(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 1, Sort.by("title").ascending());
        Slice<Movie> pagedResult = movieRepo.findAll(pageable);
        return pagedResult;
    }

    public Slice<Game> getAllGames(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 1, Sort.by("title").ascending());
        Slice<Game> pagedResult = gameRepo.findAll(pageable);
        return pagedResult;
    }
}



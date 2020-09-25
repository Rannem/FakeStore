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

    public Page<Book> getAllBooks(Integer pageNo, Integer pageSize, String sortBy) {

        PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).ascending());

        Page<Book> pagedResult = bookRepo.findAll(paging);

        return pagedResult;
    }
}



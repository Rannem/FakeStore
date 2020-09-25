package no.fakestore.fakestore;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

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

    public List<Book> getAllBooks(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = (Pageable) PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Book> pagedResult = bookRepo.findAll((org.springframework.data.domain.Pageable) paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        }
        else {
            return new ArrayList<Book>();
        }
    }
}


package no.fakestore.fakestore.Repos;

import no.fakestore.fakestore.Movie;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepo extends PagingAndSortingRepository<Movie, Integer> {
}

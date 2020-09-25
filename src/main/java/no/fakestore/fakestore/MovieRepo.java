package no.fakestore.fakestore;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepo extends PagingAndSortingRepository<Movie, Integer> {
}

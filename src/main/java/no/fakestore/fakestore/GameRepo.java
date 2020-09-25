package no.fakestore.fakestore;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GameRepo extends PagingAndSortingRepository<Game, Integer> {
}

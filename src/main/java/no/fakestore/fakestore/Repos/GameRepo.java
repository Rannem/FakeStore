package no.fakestore.fakestore.Repos;

import no.fakestore.fakestore.Game;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GameRepo extends PagingAndSortingRepository<Game, Integer> {
}

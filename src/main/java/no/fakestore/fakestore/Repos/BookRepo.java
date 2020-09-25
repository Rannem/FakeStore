package no.fakestore.fakestore.Repos;

import no.fakestore.fakestore.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepo extends PagingAndSortingRepository<Book, Integer> {
}

package no.fakestore.fakestore;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepo extends PagingAndSortingRepository<Book, Integer> {

}

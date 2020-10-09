package no.fakestore.fakestore.Repos;

import no.fakestore.fakestore.Book.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BookRepo extends PagingAndSortingRepository<Book, Integer> {
    //Counts how many books there are to add to list

}

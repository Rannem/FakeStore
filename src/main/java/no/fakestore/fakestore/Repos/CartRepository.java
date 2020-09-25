package no.fakestore.fakestore.Repos;

import no.fakestore.fakestore.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}

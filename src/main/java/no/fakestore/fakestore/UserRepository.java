package no.fakestore.fakestore;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserById(long id);

    User findUserByUserName(String username);
}

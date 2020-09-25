package no.fakestore.fakestore.Repos;

import no.fakestore.fakestore.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserById(long id);

    User findUserByUserName(String username);
}

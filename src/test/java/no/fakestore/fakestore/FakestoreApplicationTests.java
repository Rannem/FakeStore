package no.fakestore.fakestore;

import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.CartRepository;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FakestoreApplicationTests {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    BookRepo bookRepo;

    @Autowired
    GameRepo gameRepo;

    @Autowired
    MovieRepo movieRepo;

    @Autowired
    PopulateTables populateTables;

   /* @Test
    public void shouldLoginRannemTrue() {
        LoginAuthenticator test = new LoginAuthenticator(new UserAccounts());
        Assert.assertTrue(test.access("sindre", "123"));
        Assert.assertFalse(test.access("Ranem", "test123"));
    }*/

    /*@Test
    public void shouldGetAcces(){
        Assert.assertEquals;
    }*/

    @Test
    public void shouldAddCartItem() {
        Cart cart = new Cart();
        cartRepository.save(cart);
        cart.getCartItems().add(new CartItem());
        Cart cart2 = cartRepository.findAll().iterator().next();

        Assertions.assertTrue(cartRepository.count() == 1);
    }

    @Test
    public void shouldPopulatesProductTables() {
        populateTables.populate();
        Assertions.assertEquals(4, bookRepo.count());
        Assertions.assertEquals(4, gameRepo.count());
        Assertions.assertEquals(4, movieRepo.count());
    }
}

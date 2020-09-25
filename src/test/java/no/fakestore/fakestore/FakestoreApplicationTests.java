package no.fakestore.fakestore;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FakestoreApplicationTests {
@Autowired
CartRepository cartRepository;

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
    public void shouldAddCartItem(){
        Cart cart = new Cart();
        cartRepository.save(cart);
        cart.getCartItems().add(new CartItem());
        Cart cart2 = cartRepository.findAll().iterator().next();

        Assertions.assertTrue(cartRepository.count() == 1);
    }
}

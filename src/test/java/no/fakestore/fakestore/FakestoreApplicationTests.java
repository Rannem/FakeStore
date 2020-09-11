package no.fakestore.fakestore;

import org.junit.Assert;
import org.junit.Test;


public class FakestoreApplicationTests {


    @Test
    public void shouldLoginRannemTrue() {
        LoginAuthenticator test = new LoginAuthenticator(new UserAccounts());
        Assert.assertTrue(test.access("Rannem", "test123"));
        Assert.assertFalse(test.access("Ranem", "test123"));
    }
}

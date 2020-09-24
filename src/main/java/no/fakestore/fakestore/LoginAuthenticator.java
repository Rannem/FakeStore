package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticator {

    private UserAccounts userAccounts;

    LoginAuthenticator(UserAccounts userAccounts) {
        this.userAccounts = userAccounts;
    }

    public boolean access(String postUserName, String postPassWord) {
        if (userAccounts.isValidUser(postUserName, postPassWord)) {
            System.out.println("worked");
            return true;
        } else {
            System.out.println("get a account you filthy dwarf");
        }

        System.out.println("Error, dev fucked up");
        return false;
    }
}

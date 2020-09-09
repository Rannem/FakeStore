package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticator {

    UserAccounts loginAuthenticator;
    LoginAuthenticator(UserAccounts userAccounts){
        this.loginAuthenticator = userAccounts;
    }

    public boolean access(String postUserName, String postPassWord) {

        for (int i = 0; i < loginAuthenticator.getUserList().size(); i++) {
            if (postUserName.equals(loginAuthenticator.getUserList().get(i).getUserName()) && postPassWord.equals(loginAuthenticator.getUserList().get(i).getPassWord())) {
                System.out.println("worked");
                return true;
            } else {
                System.out.println("get a account you filthy dwarf");
                System.out.println(loginAuthenticator.getUserList().get(0).getUserName());
                return false;
            }
        }
        System.out.println("Error, dev fucked up");
        return false;
    }
}

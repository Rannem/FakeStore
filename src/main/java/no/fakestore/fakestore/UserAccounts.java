package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAccounts {
    private User user;
    private List<User> userList = new ArrayList<>();


    UserAccounts(){
        userList.add(new User("Helge", "Rannem", Gender.MALE, "keke@mail.com", "123456", "2000/03/03", "Rannem", "test123", "test123", "Åsvegen 75", "7715"));
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUserToList(User user){
        this.user = user;
        userList.add(user);
    }

}

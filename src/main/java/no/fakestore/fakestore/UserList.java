package no.fakestore.fakestore;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> users = new ArrayList<>();
    private User user;

    public void addUserToList(User user){
        this.user = user;
        users.add(user);
    }

}

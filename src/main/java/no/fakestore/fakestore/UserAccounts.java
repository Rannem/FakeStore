package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAccounts {
    private List<User> userList;


    public UserAccounts(){
        userList = new ArrayList<>();
        userList.add(new User("Helge", "Rannem", Gender.MALE, "keke@mail.com", "123456", "2000/03/03", "sindre", "123", "123", "Åsvegen 75", "7715"));
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUserToList(User user){
        userList.add(user);
    }
    public User getUser(String input){
        for (int i = 0; i < userList.size(); i++) {
            if (input.equals(userList.get(i).getUserName())){
                return userList.get(i);
        }
        }
        return null;
    }

}

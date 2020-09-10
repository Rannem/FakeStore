package no.fakestore.fakestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @GetMapping("/SignUp")
    public String signUp(){

        return "SignUp";
    }



    private UserList test = new UserList();
    @PostMapping("/SignUp")
    public String creatUser(@ModelAttribute User user){
        test.addUserToList(user);
        return "SignUp";
    }
}

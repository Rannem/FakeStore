package no.fakestore.fakestore.controllers;

import no.fakestore.fakestore.UserAccounts;
import no.fakestore.fakestore.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyProfileController {

    /*private UserAccounts user;

    public MyProfileController(UserAccounts user) {
        this.user = user;
    }
*/
    @Autowired
    private UserRepository repository;


    //må finne en metode for å finne riktig bruker
    @GetMapping("/profile")
    public String showProfile(Model model) {

        model.addAttribute("user", repository.findUserById(1));
       //model.addAttribute("user", user.getUserList().get(1));
        return "myprofile";
    }
}

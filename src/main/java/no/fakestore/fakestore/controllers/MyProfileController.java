package no.fakestore.fakestore.controllers;

import no.fakestore.fakestore.UserAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyProfileController {

    private UserAccounts user;

    public MyProfileController(UserAccounts user) {
        this.user = user;
    }


    //må finne en metode for å finne riktig bruker
    @GetMapping("/profile")
    public String showProfile(Model model) {
        model.addAttribute("user", user.getUserList().get(1));
        return "myprofile";
    }
}

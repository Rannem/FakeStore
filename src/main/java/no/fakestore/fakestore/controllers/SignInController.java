package no.fakestore.fakestore.controllers;

import no.fakestore.fakestore.LoginAuthenticator;
import no.fakestore.fakestore.UserAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {
    private LoginAuthenticator loginAuthenticator;
    private UserAccounts userAccounts;

    public SignInController(LoginAuthenticator loginAuthenticator, UserAccounts userAccounts) {
        this.loginAuthenticator = loginAuthenticator;
        this.userAccounts = userAccounts;
    }


    @GetMapping("/signin")
    public String login() {
        return "signin";
    }

    @PostMapping("/signin")
        public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (loginAuthenticator.access(username, password) == true){
            model.addAttribute("user", this.userAccounts.getUser(username));
            return "myprofile";
        }else{
        model.addAttribute("PasswordIsWrong", true);
            return "signin";
        }
    }

}

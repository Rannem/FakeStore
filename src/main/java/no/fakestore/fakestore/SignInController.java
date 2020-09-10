package no.fakestore.fakestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {
    public LoginAuthenticator loginAuthenticator;

    @Autowired
    public SignInController(LoginAuthenticator loginAuthenticator) {
        this.loginAuthenticator = loginAuthenticator;
    }

    @GetMapping("/signin")
    public String login() {
        return "signin";
    }

    @PostMapping("/signin")
        public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (loginAuthenticator.access(username, password) == true){
        return "kod";
    }else{
        model.addAttribute("PasswordIsWrong", true);
        return "signin";
    }
    }

}

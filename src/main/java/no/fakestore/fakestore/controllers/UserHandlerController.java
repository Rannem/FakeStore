package no.fakestore.fakestore.controllers;

import no.fakestore.fakestore.User;
import no.fakestore.fakestore.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserHandlerController {

    @Autowired
    private UserRepository repository;

    private Boolean isLogedIn = false;

    /*
    * Profile
    * */
    //må finne en metode for å finne riktig bruker
    @GetMapping("/profile")
    public String showProfile(Model model) {
        model.addAttribute("user", repository.findUserById(1));
       //model.addAttribute("user", user.getUserList().get(1));
        return "myprofile";
    }

    /*
    * SIGN in
    * */

    @GetMapping("/signin")
    public String login() {
        return "signin";
    }

    @PostMapping("/signin")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        User tempUser = null;
        try {
            tempUser = repository.findUserByUserName(username);
            if(tempUser.getUserName().equals(username) && tempUser.getPassWord().equals(password)){
                model.addAttribute("user", tempUser);

                return "myprofile";
            } else {
                model.addAttribute("PasswordIsWrong", true);
                return "signin";
            }
        } catch (NullPointerException e){
            return "/signin";
        }
    }

    /*
    * Sign up
    * */


    @GetMapping("/SignUp")
    public String signUp(Model model, HttpSession session, @ModelAttribute User user) {
        if (session.isNew()) {
            model.addAttribute("passfail", false);
            return "SignUp";
        } else {
            session.getAttribute("user");
            return "SignUp";
        }
    }

    @PostMapping("/SignUp")
    public String creatUser(@Valid User user, Model model, HttpSession session) {
        if (user.isPasswordEqual()) {
            repository.save(user);
            return "signin";
        } else {
            session.getAttribute("user");
            model.addAttribute("passfail", true);
            return "SignUp";
        }
    }
}

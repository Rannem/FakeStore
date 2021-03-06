package no.fakestore.fakestore.Controllers;


import no.fakestore.fakestore.User;
import no.fakestore.fakestore.Repos.UserRepository;
import no.fakestore.fakestore.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpSession;

@Controller
public class UserHandlerController {

    @Autowired
    private UserRepository repository;

    private Boolean isLogedIn = false;

    /*
    * Profile
    * */

    @GetMapping("/profile")
    public String showProfile() {
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
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
        User tempUser = null;
        if(session.getAttribute("user") != null){
            return "redirect:/profile";
        }
        tempUser = repository.findUserByUserName(username);
        if (tempUser.getUserName().equals(username) && tempUser.getPassWord().equals(password)) {
            session.setAttribute("user", tempUser);
            return "myprofile";
        } else {
            model.addAttribute("PasswordIsWrong", true);
            return "signin";
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
    public String creatUser(@ModelAttribute User user, Model model, HttpSession session, BindingResult br) {
        UserValidator validation = new UserValidator();
        if(validation.supports(user.getClass())){
            validation.validate(user, br);
        }
        if (br.hasErrors()){
            return "SignUp";
        }

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

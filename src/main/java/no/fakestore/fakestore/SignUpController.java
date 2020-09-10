package no.fakestore.fakestore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class SignUpController {

    private UserAccounts userlist;
    public SignUpController(UserAccounts userlist) {
        this.userlist = userlist;
    }

    @GetMapping("/SignUp")
    public String signUp(Model model, HttpSession session){
        if (session.isNew()){
            model.addAttribute("passfail", false);
            return "SignUp";
        } else{
            session.getAttribute("user");
            return "SignUp";
        }
    }

    @PostMapping("/SignUp")
    public String creatUser(@ModelAttribute User user, Model model, HttpSession session){
            if (user.isPasswordEqual()){
                userlist.addUserToList(user);
                return "signin";
            } else {
                session.getAttribute("user");
                model.addAttribute("passfail", true);
                return "SignUp";
            }
    }
}

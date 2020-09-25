package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.*;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;


    public HomeController(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
    }
    boolean userLogedIn = false;
    @GetMapping("/Home")
    public String home(Model model, HttpSession session) {
        model.addAttribute("islogedin", userLogedIn);
        if (session.getAttribute("user") != null){
            userLogedIn = true;
            model.addAttribute("islogedin", userLogedIn);
        }

        model.addAttribute("books", bookRepo.findAll());
        model.addAttribute("movies", movieRepo.findAll());
        model.addAttribute("games", gameRepo.findAll());
        return "Home";
    }

    @GetMapping("/signout")
    public String signOut(HttpSession session){
        session.invalidate();
        userLogedIn = false;
        return "redirect:/Home";
    }

}

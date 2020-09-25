package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.*;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;
    private PopulateTables populateTables;

    public HomeController(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo, PopulateTables populateTables) {
        this.populateTables = populateTables;
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
    }

    @GetMapping("/Home")
    public String home(Model model) {

        populateTables.populate();

        model.addAttribute("books", bookRepo.findAll());
        model.addAttribute("movies", movieRepo.findAll());
        model.addAttribute("games", gameRepo.findAll());
        return "Home";
    }

}

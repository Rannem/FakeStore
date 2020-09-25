package no.fakestore.fakestore.controllers;

import no.fakestore.fakestore.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


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

    @GetMapping("/Home")
    public String home(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        model.addAttribute("movies", movieRepo.findAll());
        model.addAttribute("game", gameRepo.findAll());
        return "Home";
    }

}

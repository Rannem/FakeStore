package no.fakestore.fakestore.controllers;

import no.fakestore.fakestore.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;

    public HomeController(BookLibrary bookLibrary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/Home")
    public String home(Model model) {
        model.addAttribute("books", this.bookLibrary.getBooks());
        model.addAttribute("movies", this.movieLibrary.getMovies());
        model.addAttribute("games", this.gameLibrary.getGames());
        return "Home";
    }

}

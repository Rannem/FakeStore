package no.fakestore.fakestore;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private BookLibary bookLibary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;

    public HomeController(BookLibary bookLibary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibary = bookLibary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/Home")
    public String home(Model model) {
        model.addAttribute("book", this.bookLibary.getBooks().get(0));
        model.addAttribute("movie", this.movieLibrary.getMovies().get(0));
        model.addAttribute("game", this.gameLibrary.getGames().get(0));
        return "Home";
    }

}

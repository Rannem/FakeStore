package no.fakestore.fakestore;

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
        model.addAttribute("book", this.bookLibrary.getBooks().get(0));
        model.addAttribute("movie", this.movieLibrary.getMovies().get(0));
        model.addAttribute("game", this.gameLibrary.getGames().get(0));
        return "Home";
    }

}

package no.fakestore.fakestore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Details")
public class DetailsController {

    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;

    public DetailsController(BookLibrary bookLibrary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/Book")
    public String bookDetails(Model model) {
        model.addAttribute("book", this.bookLibrary.getBooks().get(0));
        return "BookDetails";
    }

    @GetMapping("/Movie")
    public String movieDetails(Model model) {
        model.addAttribute("movie", this.movieLibrary.getMovies().get(0));
        return "MovieDetails";
    }

    @GetMapping("/Game")
    public String gameDetails(Model model) {
        model.addAttribute("game", this.gameLibrary.getGames().get(0));
        return "GameDetails";
    }
}
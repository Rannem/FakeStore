package no.fakestore.fakestore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Details")
public class DetailsController {

    private BookLibary bookLibary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;

    public DetailsController(BookLibary bookLibary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibary = bookLibary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/Book")
    public String bookDetails(Model model) {
        model.addAttribute("book", this.bookLibary.getBooks().get(0));
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

package no.fakestore.fakestore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Details")
public class DetailsController {

    private AddBooks addBooks;
    private AddMovies addMovies;
    private AddGames addGames;

    public DetailsController(AddBooks addBooks, AddMovies addMovies, AddGames addGames) {
        this.addBooks = addBooks;
        this.addMovies = addMovies;
        this.addGames = addGames;
    }

    @GetMapping("/Book")
    public String bookDetails(Model model) {
        model.addAttribute("book", this.addBooks.getBooks().get(0));
        return "BookDetails";
    }

    @GetMapping("/Movie")
    public String movieDetails(Model model) {
        model.addAttribute("movie", this.addMovies.getMovies().get(0));
        return "MovieDetails";
    }

    @GetMapping("/Game")
    public String gameDetails(Model model) {
        model.addAttribute("game", this.addGames.getGames().get(0));
        return "GameDetails";
    }
}

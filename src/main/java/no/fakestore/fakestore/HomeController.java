package no.fakestore.fakestore;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private AddBooks addBooks;
    private AddMovies addMovies;
    private AddGames addGames;

    public HomeController(AddBooks addBooks, AddMovies addMovies, AddGames addGames) {
        this.addBooks = addBooks;
        this.addMovies = addMovies;
        this.addGames = addGames;
    }

    @GetMapping("/Home")
    public String home(Model model) {
        model.addAttribute("book", this.addBooks.getBooks().get(0));
        model.addAttribute("movie", this.addMovies.getMovies().get(0));
        model.addAttribute("game", this.addGames.getGames().get(0));
        return "Home";
    }

}

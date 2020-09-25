package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Details")
public class DetailsController {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;

    public DetailsController(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
    }

    @GetMapping("/Book")
    public String bookDetails(Model model, @RequestParam Integer productId) {
        model.addAttribute("book", bookRepo.findById(productId).get());
        return "BookDetails";
    }

    @GetMapping("/Movie")
    public String movieDetails(Model model, @RequestParam Integer productId) {
        model.addAttribute("movie", movieRepo.findById(productId).get());
        return "MovieDetails";
    }

    @GetMapping("/Game")
    public String gameDetails(Model model, @RequestParam Integer productId) {
        model.addAttribute("game", gameRepo.findById(productId).get());
        return "GameDetails";
    }
}

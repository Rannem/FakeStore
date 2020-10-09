package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Page")
public class PageViewController {

    private Pageinator pageinator;

    public PageViewController(Pageinator pageinator) {
        this.pageinator = pageinator;
    }

    @GetMapping("/Book")
    public String getBooks(Model model, @RequestParam(defaultValue = "1") Integer pageNo) {
        model.addAttribute("page", pageinator.getAllBooks(pageNo - 1));
        return "PageOfBooks";
    }

    @GetMapping("/Movie")
    public String getMovies(Model model, @RequestParam(defaultValue = "1") Integer pageNo) {
        model.addAttribute("page", pageinator.getAllMovies(pageNo - 1));
        return "PageOfMovies";
    }

    @GetMapping("/Game")
    public String getGames(Model model, @RequestParam(defaultValue = "1") Integer pageNo) {
        model.addAttribute("page", pageinator.getAllGames(pageNo - 1));
        return "PageOfGames";
    }

    @GetMapping("/Product")
    public String getProducts(Model model, @RequestParam(defaultValue = "1") Integer pageNo) {
        model.addAttribute("pageBook", pageinator.getAllBooks(pageNo - 1));
        model.addAttribute("pageMovie", pageinator.getAllMovies(pageNo - 1));
        model.addAttribute("pageGame", pageinator.getAllGames(pageNo - 1));
        return "PageOfProducts";
    }
}
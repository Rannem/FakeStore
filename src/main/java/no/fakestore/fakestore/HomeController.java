package no.fakestore.fakestore;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private AddBooks addBooks;

    public HomeController(AddBooks addBooks) {
        this.addBooks = addBooks;
    }

    @GetMapping("/Home")
    public String home(Model model) {
        model.addAttribute("book", this.addBooks.getBooks().get(0));
        return "Home";
    }

}

package no.fakestore.fakestore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Page")
public class PageViewController {

    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;
    private int currentPage;

    public PageViewController(BookLibrary bookLibrary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/Book")
    public String home(HttpSession session, @RequestParam(required = false, defaultValue = "0") int page) {
        List<Book> pageOfBooks = this.bookLibrary.getPage(page, 3);
        List<Integer> numOfPages = new ArrayList<>();
        for (int i = 0; i < this.bookLibrary.numberOfPages(10); i++) {
            numOfPages.add(i, i);
        }

        currentPage = page;
        session.setAttribute("pageOfBooks", pageOfBooks);
        session.setAttribute("numOfPages", numOfPages);
        session.setAttribute("currentPage", page);
        session.setAttribute("totNumPages", numOfPages.size() - 1);
        session.setAttribute("prev", page - 1);
        session.setAttribute("next", page + 1);
        return "PageOfBooks";
    }
}
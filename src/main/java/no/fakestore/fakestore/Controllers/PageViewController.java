package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.*;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Page")
public class PageViewController {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;
    private Pageinator pageinator;

    public PageViewController(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo, Pageinator pageinator) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
        this.pageinator = pageinator;
    }

    @GetMapping("/Book")
    public ResponseEntity<List<Book>> getAllEmployees(@RequestParam(defaultValue = "0") Integer pageNo, @RequestParam(defaultValue = "3") Integer pageSize, @RequestParam(defaultValue = "name") String sortBy) {
        List<Book> list = pageinator.getAllBooks(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<Book>>(list, new HttpHeaders(), HttpStatus.OK);
    }


//    @GetMapping("/Book")
//    public String bookPage(HttpSession session, @RequestParam(required = false, defaultValue = "0") int page) {
//        List<Book> pageOfBooks = this.bookLibrary.getPage(page, 3);
//        List<Integer> numOfPages = new ArrayList<>();
//        for (int i = 0; i < this.bookLibrary.numberOfPages(10); i++) {
//            numOfPages.add(i, i);
//        }
//
//        currentPage = page;
//        session.setAttribute("pageOfBooks", pageOfBooks);
//        session.setAttribute("numOfPages", numOfPages);
//        session.setAttribute("currentPage", page);
//        session.setAttribute("totNumPages", numOfPages.size() - 1);
//        session.setAttribute("prev", page - 1);
//        session.setAttribute("next", page + 1);
//        return "PageOfBooks";
//    }
//
//    @GetMapping("/Movie")
//    public String moviePage(HttpSession session, @RequestParam(required = false, defaultValue = "0") int page) {
//        List<Movie> pageOfMovies = this.movieLibrary.getPage(page, 3);
//        List<Integer> numOfPages = new ArrayList<>();
//        for (int i = 0; i < this.movieLibrary.numberOfPages(10); i++) {
//            numOfPages.add(i, i);
//        }
//
//        currentPage = page;
//        session.setAttribute("pageOfMovie", pageOfMovies);
//        session.setAttribute("numOfPages", numOfPages);
//        session.setAttribute("currentPage", page);
//        session.setAttribute("totNumPages", numOfPages.size() - 1);
//        session.setAttribute("prev", page - 1);
//        session.setAttribute("next", page + 1);
//        return "PageOfMovies";
//    }
//
//    @GetMapping("/Game")
//    public String gamePage(HttpSession session, @RequestParam(required = false, defaultValue = "0") int page) {
//        List<Game> pageOfGames = this.gameLibrary.getPage(page, 3);
//        List<Integer> numOfPages = new ArrayList<>();
//        for (int i = 0; i < this.gameLibrary.numberOfPages(10); i++) {
//            numOfPages.add(i, i);
//        }
//
//        currentPage = page;
//        session.setAttribute("pageOfGames", pageOfGames);
//        session.setAttribute("numOfPages", numOfPages);
//        session.setAttribute("currentPage", page);
//        session.setAttribute("totNumPages", numOfPages.size() - 1);
//        session.setAttribute("prev", page - 1);
//        session.setAttribute("next", page + 1);
//        return "pageOfGames";
//    }
}
package no.fakestore.fakestore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {

    private BookLibary bookLibrary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;

    public CartController(BookLibary bookLibrary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/cart")
    public String cart(){

        return "cart";
    }


    List<Product> cartlist = new ArrayList<>();

    @PostMapping("/cart")
    public String cart(HttpSession session, @RequestParam int productId, Model model){

        List<Integer> cart = (List)session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }
        cart.add(productId);

        for (int i = 0; i < cart.size(); i++) {
            if (productId == bookLibrary.getBooks().get(i).getProductId()){
                cartlist.add(bookLibrary.getBooks().get(i));
                model.addAttribute("book", bookLibrary.getBooks().get(i).toString());
            }
            else if (productId == gameLibrary.getGames().get(i).getProductId()){
                cartlist.add(gameLibrary.getGames().get(i));
                model.addAttribute("game",gameLibrary.getGames().get(i).getTitle());
            }
            else if (productId == movieLibrary.getMovies().get(i).getProductId()){
                cartlist.add(movieLibrary.getMovies().get(i));
                model.addAttribute("movie", movieLibrary.getMovies().get(i).getTitle());
            }
        }
        double total = 0;
        for (Product item:
             cartlist) {
            total += Double.parseDouble(item.getPrice());
        }
        model.addAttribute("cartlist", cartlist);
        model.addAttribute("total", total);

        return "cart";
    }
}


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

    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private GameLibrary gameLibrary;

    public CartController(BookLibrary bookLibrary, MovieLibrary movieLibrary, GameLibrary gameLibrary) {
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/cart")
    public String cart(HttpSession session, Model model) {
        List<Product> cartlist = new ArrayList<>();
        List<Integer> cart = (List) session.getAttribute("cart");
        populateModel(model, cartlist, cart);
        return "cart";
    }


    @PostMapping("/cart")
    public String cart(HttpSession session, @RequestParam int productId, Model model) {
        List<Product> cartlist = new ArrayList<>();
        List<Integer> cart = (List) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        cart.add(productId);
        populateModel(model, cartlist, cart);

        return "cart";
    }

    private void populateModel(Model model, List<Product> cartlist, List<Integer> cart) {
        for (int i = 0; i < bookLibrary.getBooks().size(); i++) {
            for (int j = 0; j < cart.size(); j++) {
                int cartProductId = cart.get(j);
                if (cartProductId == bookLibrary.getBooks().get(i).getProductId()) {
                    cartlist.add(bookLibrary.getBooks().get(i));
                }
            }
        }

        for (int i = 0; i < gameLibrary.getGames().size(); i++) {
            for (int j = 0; j < cart.size(); j++) {
                int cartProductId = cart.get(j);
                if (cartProductId == gameLibrary.getGames().get(i).getProductId()) {
                    cartlist.add(gameLibrary.getGames().get(i));
                }
            }
        }

        for (int i = 0; i < movieLibrary.getMovies().size(); i++) {
            for (int j = 0; j < cart.size(); j++) {
                int cartProductId = cart.get(j);
                if (cartProductId == movieLibrary.getMovies().get(i).getProductId()) {
                    cartlist.add(movieLibrary.getMovies().get(i));
                }
            }
        }

        double total = 0;
        for (
                Product item :
                cartlist) {
            total += Double.parseDouble(item.getPrice());
        }
        model.addAttribute("cartlist", cartlist);
        model.addAttribute("total", total);
    }
}


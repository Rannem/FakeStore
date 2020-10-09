package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.Cart;
import no.fakestore.fakestore.CartItem;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.CartRepository;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import no.fakestore.fakestore.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class CartController {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;
    private CartRepository cartRepository;

    public CartController(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo, CartRepository cartRepository) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
        this.cartRepository = cartRepository;
    }



    @GetMapping("/cart")
    public String cart(HttpSession session, Model model) {
        //når man går inn på cart så skal man sjekke om man har ein cart session(logged in)
        //vise liste eller et tomt view
        if (session.getAttribute("user") != null) {
            //hvis carten til bruker
        } else {
            return "redirect:/signin"; // tomt view
        }

        return "cart";
    }


    @PostMapping("/cart")
    public String cartBook(HttpSession session, @RequestParam int productId, Model model) {
        if (session.getAttribute("user") != null) {
            Cart cart;
            if (session.getAttribute("cart") == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
                cart.setUser((User) session.getAttribute("user"));
            }else {
                cart = (Cart) session.getAttribute("cart");
            }
            cart.getCartItems().add(new CartItem(bookRepo.findById(productId).get()));
            cartRepository.save(cart);
            model.addAttribute("item", cart);
            return "cart";
        }
        return "redirect:/signin";
    }

    @PostMapping("/cartGame")
    public String cartGame(HttpSession session, @RequestParam int productId) {
        if (session.getAttribute("user") != null) {
            Cart cart;
            if (session.getAttribute("cart") == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
                cart.setUser((User) session.getAttribute("user"));
            }else {
                cart = (Cart) session.getAttribute("cart");
            }
            cart.getCartItems().add(new CartItem(gameRepo.findById(productId).get()));
            return "cart";
        }
        return "redirect:/signin";
    }

    @PostMapping("/cartMovie")
    public String cartMovie(HttpSession session, @RequestParam int productId) {
        if (session.getAttribute("user") != null) {
            Cart cart;
            if (session.getAttribute("cart") == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
                cart.setUser((User) session.getAttribute("user"));
            }else {
                cart = (Cart) session.getAttribute("cart");
            }
            cart.getCartItems().add(new CartItem(gameRepo.findById(productId).get()));
            return "cart";
        }
        return "redirect:/signin";
    }

}



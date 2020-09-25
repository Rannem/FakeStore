/*
package no.fakestore.fakestore.Controllers;

import no.fakestore.fakestore.*;
import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
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

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;

    public CartController(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
    }
    private Cart cart;
    @GetMapping("/cart")
    public String cart(HttpSession session) {
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
    public String cart(HttpSession session, @RequestParam int productId, Model model) {
        if (session.getAttribute("user") != null) {
            if (cart == null) {
                cart = new Cart();
                cart.setUser((User) session.getAttribute("user"));
                //add item med item type sjekk
                if ()
                cart.getCartItems().add(gameRepo.getId(productid)));
                cart.getCartItems().add(findPruduct(productId)));
            } else {
                return "redirect:/signin";
            }
        }
        return "cart";
    }


    public Product findPruduct(int productId){





    }
}

*/

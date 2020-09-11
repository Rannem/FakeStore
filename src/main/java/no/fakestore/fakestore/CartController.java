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

    private AddBooks bookLibrary;
    private AddMovies addMovies;
    private AddGames gameLibrary;

    public CartController(AddBooks bookLibrary, AddMovies addMovies, AddGames gameLibrary) {
        this.bookLibrary = bookLibrary;
        this.addMovies = addMovies;
        this.gameLibrary = gameLibrary;
    }

    @GetMapping("/cart")
    public String cart(){

        return "cart";
    }



   /* private Cart productsCart = new Cart();*/
    @PostMapping("/cart")
    public String cart(HttpSession session, @RequestParam int productId, Model model){
        /*productsCart.addProductToList(product);*/
        List<Integer> cart = (List)session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            cart.add(productId);
        }else {
            cart.add(productId);
        }
        List<Product> handlekurv = new ArrayList<>();
        for (int i = 0; i < cart.size(); i++) {
            if (productId == bookLibrary.getBooks().get(i).getProductId()){
                handlekurv.add(bookLibrary.getBooks().get(i));
                model.addAttribute("book", bookLibrary.getBooks().get(i).toString());
            }
            else if (productId == gameLibrary.getGames().get(i).getProductId()){
                handlekurv.add(gameLibrary.getGames().get(i));
                model.addAttribute("game",gameLibrary.getGames().get(i).getTitle());
            }
        }
        double total = 0;
        for (Product item:
             handlekurv) {
            total += Double.parseDouble(item.getPrice());
        }
        model.addAttribute("handlekurv", handlekurv);
        model.addAttribute("total", total);

        return "cart";
    }
}

/*

    @PostMapping("/")
    public String level1post(HttpSession session, @RequestParam String item){
        List<String> cart = (List)session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }
        cart.add(item);

        return "level1";
    }
}*/

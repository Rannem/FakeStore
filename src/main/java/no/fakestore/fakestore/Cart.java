package no.fakestore.fakestore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartID;

    @ManyToOne
    private User user;


    @OneToMany(cascade = CascadeType.ALL)
    private List<CartItem> cartItems = new ArrayList<>();


    private int totalPrice;


    public Cart() {

    }

    public Cart(Long cartID, int totalPrice) {
        this.cartID = cartID;
        this.totalPrice = totalPrice;
    }

    public Long getCartID() {
        return cartID;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

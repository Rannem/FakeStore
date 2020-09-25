package no.fakestore.fakestore;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String price;

    public Product() {
    }

    public Product(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }
}

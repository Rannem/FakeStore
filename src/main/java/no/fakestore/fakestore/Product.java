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
    private String productType;

    public Product() {
    }

    public Product(String price, int productId, String productType) {
        this.price = price;
        this.productId = productId;
        this.productType = productType;
    }

    public String getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductType() {
        return productType;
    }
}

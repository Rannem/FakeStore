package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

public class Product {

    private double price;
    private int productId;
    private String productType;

    public Product(double price, int productId, String productType) {
        this.price = price;
        this.productId = productId;
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductType() {
        return productType;
    }
}

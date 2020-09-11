package no.fakestore.fakestore;

public class Product {

    private String price;
    private int productId;
    private String productType;

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

package no.fakestore.fakestore;

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

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}

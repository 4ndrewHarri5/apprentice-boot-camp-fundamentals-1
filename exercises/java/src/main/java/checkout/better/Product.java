package checkout.better;

public class Product {

    private final String sku;
    private String name;
    private double price;

    public Product(String sku) {
        this.sku = sku;

        Data productData = Data.parse(sku);
        this.name = name = productData.getName();
        this.price = price = productData.getPrice();
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

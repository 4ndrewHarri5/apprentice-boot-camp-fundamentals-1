package checkout.better;

public class Scanner {

    /**
     *
     * takes in an sku and returns a product
     *
     */
    static Product scan(String sku) {
        return new Product(sku);
    }

}

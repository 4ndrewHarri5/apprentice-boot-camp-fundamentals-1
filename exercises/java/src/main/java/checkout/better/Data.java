package checkout.better;

public enum Data {

    A("A", "A", 50),
    B("B", "B", 30),
    C("C", "C", 20),
    D("D", "D", 15);

    private final String sku;
    private final String name;
    private final double price;

    Data(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
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

    public static Data parse(String sku) {
        switch (sku) {
            case "A": return Data.A;
            case "B": return Data.B;
            case "C": return Data.C;
            case "D": return Data.D;
            default: throw new Error("Product does not exist");
        }
    }

}

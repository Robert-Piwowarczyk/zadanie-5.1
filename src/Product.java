public class Product {
    private String name;
    private String description;
    private double price;
    private String category;

    public Product(String name, String description
            , String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    double grossPriceRtv(double price) {
        return
                (price * 0.23) + price;
    }

    double grossPriceFood(double price) {
        return
                (price * 0.08) + price;
    }
}

package entities;

public class Product {
    private String name;
    private Double price;

    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String upperCaseStatic(Product p) {
        return p.getName().toUpperCase();
    }

    public String upperCaseNonStatic() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product name: " + name);
        sb.append("\nPrice: " + String.format("%.2f", price));
        sb.append("\n==========");
        return sb.toString();
    }

}

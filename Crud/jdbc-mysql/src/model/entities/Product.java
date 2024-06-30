package model.entities;

public class Product {
    private Long id;
    private String description;
    private String imageUri;
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String description, Double price, String name, String imageUri, Long id) {
        this.description = description;
        this.price = price;
        this.name = name;
        this.imageUri = imageUri;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
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

    @Override
    public String toString() {
        return "Product " +
                "id: " + id +
                ", description: " + description +
                ", imageUri: " + imageUri +
                ", name: " + name +
                ", price: " + price;
    }
}

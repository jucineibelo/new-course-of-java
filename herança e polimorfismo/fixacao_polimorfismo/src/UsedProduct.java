import java.util.Date;

public class UsedProduct extends Product {
    private Date manufectureDate;

    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, Date manufectureDate) {
        super(name, price);
        this.manufectureDate = manufectureDate;
    }

    public Date getManufectureDate() {
        return manufectureDate;
    }

    public void setManufectureDate(Date manufectureDate) {
        this.manufectureDate = manufectureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + manufectureDate + ")";
    }

}


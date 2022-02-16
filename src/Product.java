import java.util.Date;
import java.util.Objects;

public class Product {
    private String name;
    private String brand;
    private Float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Product(String name, String brand, Float price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && brand.equals(product.brand) && price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price);
    }
    public Float generate_discounts(Date date){
        return Float.valueOf(0);
    }
}

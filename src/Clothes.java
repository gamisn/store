import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Clothes extends Product{
    private String size;
    private String color;
    public Clothes(String name, String brand, Float price, String m, String violet) {
        super(name, brand, price);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return size.equals(clothes.size) && color.equals(clothes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, color);
    }

    @Override
    public Float generate_discounts(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Integer day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        //sunday = 1 monday = 2
        if(day_of_week > 2){
            return Float.valueOf((float) 0.1);
        }
        return Float.valueOf(0);
    }
}

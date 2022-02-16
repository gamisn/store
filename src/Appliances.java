import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Appliances extends Product{
    private String model;
    private Date production_date;
    private Float weight;

    public Appliances(String name, String brand, Float price,String model,Date prod_date, Float weight) {
        super(name, brand, price);
        this.model = model;
        this.production_date = prod_date;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Appliances that = (Appliances) o;
        return model.equals(that.model) && production_date.equals(that.production_date) && weight.equals(that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, production_date, weight);
    }

    @Override
    public Float generate_discounts(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Integer day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        if((day_of_week == 1 || day_of_week >6 ) && this.getPrice() > 999){
            return Float.valueOf((float) 0.07);

        }
        return Float.valueOf(0);
    }
}

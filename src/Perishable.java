import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Perishable extends  Product{
    private Date expiration_date;
    public Perishable(String name, String brand, Float price,Date expiration_date) {
        super(name, brand, price);
        this.expiration_date = expiration_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Perishable that = (Perishable) o;
        return expiration_date.equals(that.expiration_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expiration_date);
    }

    @Override
    public Float generate_discounts(Date date){
        long diffmilli = Math.abs(date.getTime() - this.expiration_date.getTime());
        long diffdays = TimeUnit.DAYS.convert(diffmilli,TimeUnit.MILLISECONDS);

        if(diffdays == 0){
            return Float.valueOf((float) 0.7);
        }

        if( diffdays < 5){
            return Float.valueOf((float) 0.3);
        }
        return Float.valueOf(0);
    }
}
